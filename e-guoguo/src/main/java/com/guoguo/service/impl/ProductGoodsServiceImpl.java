package com.guoguo.service.impl;

import com.github.pagehelper.PageHelper;
import com.guoguo.bean.*;
import com.guoguo.mapper.*;
import com.guoguo.reqsVo.GoodsAddVo;
import com.guoguo.reqsVo.GoodsQueryVo;
import com.guoguo.respVo.GoodsResp;
import com.guoguo.respVo.JsonResultPage;
import com.guoguo.service.ProductGoodsService;
import com.guoguo.common.Constants;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/4/2.
 */
@Service
public class ProductGoodsServiceImpl implements ProductGoodsService {


    @Autowired
    private ProductGoodsMapper productGoodsMapper;

    @Autowired
    private SystemCodeMapper systemCodeMapper;

    @Autowired
    private ShowCategoryMapper showCategoryMapper;

    @Autowired
    private NationCodeMapper nationCodeMapper;

    @Autowired
    private NationRegionMapper nationRegionMapper;

    @Override
    public JsonResultPage<List<GoodsResp>> getAllGoods(GoodsQueryVo vo) {
        com.github.pagehelper.Page p = PageHelper.startPage(vo.getPage(),vo.getLimit());
        ProductGoodsExample example = new ProductGoodsExample();
        ProductGoodsExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(vo.getGoodsName()))
            criteria.andGoodsNameLike("%"+vo.getGoodsName()+"%");
        if(null != vo.getSaleStatus())
            criteria.andSaleStatusEqualTo(vo.getSaleStatus());
        if(StringUtils.isNotBlank(vo.getSortName())){
            example.setOrderByClause(vo.getSortName()+" " + vo.getSortOrder());
        }
        criteria.andIsDelEqualTo(Constants.IS_DEL.NO);
        List<ProductGoods> list = productGoodsMapper.selectByExample(example);
        List<GoodsResp> resps = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(list)){
            list.forEach(p1 -> {
                GoodsResp resp = new GoodsResp();
                BeanUtils.copyProperties(p1,resp);
                if(StringUtils.isNotBlank(resp.getChargeUnit()))
                    resp.setChargeUnitName(systemCodeMapper.selectCodeName(Constants.SYSTEM_CODE.UNIT,resp.getChargeUnit()));
                if(StringUtils.isNotBlank(resp.getStandardUnit()))
                    resp.setStandardUnitName(resp.getStandard()+systemCodeMapper.selectCodeName(Constants.SYSTEM_CODE.STANDARD_UNIT, resp.getStandardUnit()));
                if(null != resp.getLvInfo())
                    resp.setLvInfoName(systemCodeMapper.selectCodeName(Constants.SYSTEM_CODE.PRODUCT_LV, resp.getLvInfo().toString()));
                if(StringUtils.isBlank(resp.getProvinceId())){
                    resp.setProvinceName(resp.getCountryName());
                }else{
                    resp.setProvinceName(resp.getProvinceName()+resp.getCityName());
                }
                resps.add(resp);
            });
        }
        JsonResultPage<List<GoodsResp>> page = new JsonResultPage<>(vo.getPage(),vo.getLimit(),(int)p.getTotal());
        page.setOk(true);
        page.setRows(resps);
        page.setResDescription("查询成功");
        return page;
    }

    @Override
    public int AddGoods(GoodsAddVo goods) {
        ProductGoods record = new ProductGoods();
        BeanUtils.copyProperties(goods,record);
        setParams(record);
        return productGoodsMapper.insertSelective(record);
    }

    @Override
    public int updateGoods(GoodsAddVo goods) {
        ProductGoods record = new ProductGoods();
        BeanUtils.copyProperties(goods,record);
        if(null == record.getProvinceId())
            record.setProvinceId("");
        if(null == record.getCityId())
            record.setCityId("");
        if(null == record.getId())
            return 0;
        setParams(record);
        return productGoodsMapper.updateByPrimaryKeySelective(record);
    }

    private void setParams(ProductGoods goods){
        if(null != goods.getCategoryId()){
            goods.setCategoryName(showCategoryMapper.selectByPrimaryKey(goods.getCategoryId()).getCategoryName());
        }
        if(StringUtils.isNotBlank(goods.getCountryId())){
            NationCodeExample example = new NationCodeExample();
            example.createCriteria().andIsDelEqualTo(Constants.IS_DEL.NO).andNationCodeEqualTo(goods.getCountryId());
            List<NationCode> list = nationCodeMapper.selectByExample(example);
            if(CollectionUtils.isNotEmpty(list))
                goods.setCountryName(list.get(0).getNationName());
        }
        goods.setProvinceName(getNationRegion(goods.getProvinceId()));
        goods.setCityName(getNationRegion(goods.getCityId()));
    }

    private String getNationRegion(String code){
        if(StringUtils.isNotBlank(code)){
            NationRegionExample example = new NationRegionExample();
            example.createCriteria().andIsDelEqualTo(Constants.IS_DEL.NO).andAdressCodeEqualTo(code);
            List<NationRegion> list = nationRegionMapper.selectByExample(example);
            if(CollectionUtils.isNotEmpty(list))
                return list.get(0).getAdress();
        }
        return "";
    }
}

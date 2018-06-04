package com.guoguo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.guoguo.common.JsonResultPage;
import com.guoguo.mapper.ProductGoodsMapper;
import com.guoguo.respVo.ProductGoodsResp;
import com.guoguo.service.ProductGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2018/4/23.
 */
@Service
public class ProductGoodsServiceImpl implements ProductGoodsService {

    @Autowired
    private ProductGoodsMapper productGoodsMapper;

    @Override
    public JsonResultPage<List<ProductGoodsResp>> getList(Integer categoryId,int page,int limit) {
        Page p = PageHelper.startPage(page,limit);
        List<ProductGoodsResp> list = productGoodsMapper.selectList(categoryId);
        JsonResultPage resultPage = new JsonResultPage(page,limit,(int)p.getTotal());
        resultPage.setOk(true);
        resultPage.setRows(list);
        resultPage.setResDescription("查询成功");
        return resultPage;
    }
}

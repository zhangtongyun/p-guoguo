package com.guoguo.service.impl;

import com.guoguo.bean.NationRegion;
import com.guoguo.bean.NationRegionExample;
import com.guoguo.common.Constants;
import com.guoguo.mapper.NationRegionMapper;
import com.guoguo.respVo.NationRegionResp;
import com.guoguo.service.NationRegionService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/4/4.
 */
@Service
public class NationRegionServiceImpl implements NationRegionService {

    @Autowired
    private NationRegionMapper nationRegionMapper;
    @Override
    public List<NationRegionResp> getProvince(String nationCode) {
        List<NationRegionResp> resps = new ArrayList<>();
        if(StringUtils.isBlank(nationCode))
            return resps;
        NationRegionExample example = new NationRegionExample();
        example.createCriteria().andIsDelEqualTo(Constants.IS_DEL.NO).andNationCodeEqualTo(nationCode)
                .andParentCodeEqualTo("0");
        List<NationRegion> list = nationRegionMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(list)){
            list.forEach( n -> {
                NationRegionResp r = new NationRegionResp();
                BeanUtils.copyProperties(n,r);
                resps.add(r);
            });
        }
        return resps;
    }

    @Override
    public List<NationRegionResp> getCity(String parentCode) {
        List<NationRegionResp> resps = new ArrayList<>();
        if(StringUtils.isBlank(parentCode))
            return resps;
        NationRegionExample example = new NationRegionExample();
        example.createCriteria().andIsDelEqualTo(Constants.IS_DEL.NO).andParentCodeEqualTo(parentCode);
        List<NationRegion> list = nationRegionMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(list)){
            list.forEach( n -> {
                NationRegionResp r = new NationRegionResp();
                BeanUtils.copyProperties(n,r);
                resps.add(r);
            });
        }
        return resps;
    }
}

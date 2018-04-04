package com.guoguo.service.impl;

import com.guoguo.bean.ShowCategory;
import com.guoguo.bean.ShowCategoryExample;
import com.guoguo.common.Constants;
import com.guoguo.mapper.ShowCategoryMapper;
import com.guoguo.respVo.ShowCategoryResp;
import com.guoguo.service.ShowCategoryService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/4/4.
 */
@Service
public class ShowCategoryServiceImpl implements ShowCategoryService {

    @Autowired
    private ShowCategoryMapper showCategoryMapper;


    @Override
    public List<ShowCategoryResp> getLevOneCategory() {
        ShowCategoryExample example = new ShowCategoryExample();
        example.createCriteria().andUseStateEqualTo(Constants.USE_STATE.VALID).andCategoryLevelEqualTo(1);
        List<ShowCategory> list = showCategoryMapper.selectByExample(example);
        List<ShowCategoryResp> resps = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(list)){
            list.forEach(s -> {
                ShowCategoryResp r = new ShowCategoryResp();
                BeanUtils.copyProperties(s,r);
                resps.add(r);
            });
        }

        return resps;
    }
}

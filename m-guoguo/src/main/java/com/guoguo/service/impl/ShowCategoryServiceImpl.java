package com.guoguo.service.impl;

import com.guoguo.bean.ShowCategoryExample;
import com.guoguo.common.Constants;
import com.guoguo.mapper.ShowCategoryMapper;
import com.guoguo.respVo.ShowCategoryResp;
import com.guoguo.service.ShowCategoryService;
import com.guoguo.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2018/4/23.
 */
@Service
public class ShowCategoryServiceImpl implements ShowCategoryService {

    @Autowired
    private ShowCategoryMapper showCategoryMapper;

    @Override
    public List<ShowCategoryResp> getLevOne() {
        ShowCategoryExample example = new ShowCategoryExample();
        example.createCriteria().andUseStateEqualTo(Constants.USE_STATE.VALID);
        return Util.copyList(showCategoryMapper.selectByExample(example),ShowCategoryResp.class);
    }
}

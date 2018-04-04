package com.guoguo.service;

import com.guoguo.respVo.ShowCategoryResp;

import java.util.List;

/**
 * Created by lenovo on 2018/4/4.
 */
public interface ShowCategoryService {

    /**
     * 获取所有一级有效的分类
     * @return
     */
    List<ShowCategoryResp> getLevOneCategory();
}

package com.guoguo.service;

import com.guoguo.respVo.NationCodeResp;

import java.util.List;

/**
 * Created by lenovo on 2018/4/4.
 */
public interface NationCodeService {

    /**
     * 获取所有国家
     * @return
     */
    List<NationCodeResp> getNation();
}

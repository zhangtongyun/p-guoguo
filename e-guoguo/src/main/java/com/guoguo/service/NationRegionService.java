package com.guoguo.service;

import com.guoguo.respVo.NationRegionResp;

import java.util.List;

/**
 * Created by lenovo on 2018/4/4.
 */
public interface NationRegionService {

    /**
     * 根据国家代码选择城市
     * @param nationCode
     * @return
     */
    List<NationRegionResp> getProvince(String nationCode);

    /**
     * 根据省份获取城市
     * @param parentCode
     * @return
     */
    List<NationRegionResp> getCity(String parentCode);
}

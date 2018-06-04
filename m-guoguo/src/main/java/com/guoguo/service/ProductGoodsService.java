package com.guoguo.service;

import com.guoguo.common.JsonResultPage;
import com.guoguo.respVo.ProductGoodsResp;

import java.util.List;

/**
 * Created by lenovo on 2018/4/23.
 */
public interface ProductGoodsService {

    JsonResultPage<List<ProductGoodsResp>> getList(Integer categoryId,int page,int limit);
}

package com.guoguo.service;

import com.guoguo.reqsVo.GoodsAddVo;
import com.guoguo.reqsVo.GoodsQueryVo;
import com.guoguo.respVo.GoodsResp;
import com.guoguo.respVo.JsonResultPage;

import java.util.List;

/**
 * Created by lenovo on 2018/4/2.
 */
public interface ProductGoodsService {

    /**
     * 分页获取商品
     * @param vo
     * @return
     */
    JsonResultPage<List<GoodsResp>> getAllGoods(GoodsQueryVo vo);

    /**
     * 添加商品
     * @param goods
     * @return
     */
    int AddGoods(GoodsAddVo goods);

    /**
     * 修改商品
     * @param goods
     * @return
     */
    int updateGoods(GoodsAddVo goods);
}

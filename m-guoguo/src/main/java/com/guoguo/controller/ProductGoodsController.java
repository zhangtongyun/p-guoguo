package com.guoguo.controller;

import com.guoguo.common.JsonResultPage;
import com.guoguo.reqsVo.ProductGoodsQueryVo;
import com.guoguo.service.ProductGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Created by lenovo on 2018/4/23.
 */
@RestController
@RequestMapping("productGoods")
public class ProductGoodsController {

    @Autowired
    private ProductGoodsService productGoodsService;

    @RequestMapping(value = "getList",method = RequestMethod.POST)
    public JsonResultPage getList(@RequestBody @Valid ProductGoodsQueryVo vo){
        JsonResultPage page = new JsonResultPage();

        if(null == vo){
            page.setOk(false);
            page.setResDescription("条件有误");
            return page;
        }
        return productGoodsService.getList(vo.getCategoryId(), vo.getPage(), vo.getLimit());
    }
}

package com.guoguo.controller;

import com.guoguo.reqsVo.GoodsAddVo;
import com.guoguo.reqsVo.GoodsQueryVo;
import com.guoguo.respVo.GoodsResp;
import com.guoguo.respVo.JsonResult;
import com.guoguo.respVo.JsonResultPage;
import com.guoguo.service.ProductGoodsService;
import com.guoguo.common.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lenovo on 2018/4/3.
 */
@Controller
@RequestMapping("productGoods")
public class ProductGoodsController extends BaseController {

    @Autowired
    private ProductGoodsService productGoodsService;



    @RequestMapping("grid")
    public String grid(Model model){
        model.addAttribute("categoryList",getLevOneCategory());
        return "goods/goodsList";
    }

    @RequestMapping(value = "getList",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResultPage<List<GoodsResp>> getList(@RequestBody GoodsQueryVo vo){

        return productGoodsService.getAllGoods(vo);
    }

    @RequestMapping(value = "addGoods",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<Integer> addGoods(@RequestBody GoodsAddVo addVo){
        addVo.setCreateOperator(getLoginUser().getUserName());
        int i = productGoodsService.AddGoods(addVo);
        return JsonResult.newSuccess(i,"添加成功");
    }

    @RequestMapping(value = "updateGoods",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<Integer> updateGoods(@RequestBody GoodsAddVo addVo){
        if(null == addVo.getId())
            return JsonResult.newError(Constants.ERROR_FORMAT_CODE,"id不能为空");
        addVo.setUpdateOperator(getLoginUser().getUserName());
        int i = productGoodsService.updateGoods(addVo);
        return JsonResult.newSuccess(i,"修改成功");
    }

    @RequestMapping(value = "delGoods/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<Integer> delGoods(@PathVariable("id") Integer id){
        GoodsAddVo addVo  = new GoodsAddVo();
        addVo.setId(id);
        addVo.setIsDel(Constants.IS_DEL.YES);
        int i = productGoodsService.updateGoods(addVo);
        return JsonResult.newSuccess(i,"删除成功");
    }

}

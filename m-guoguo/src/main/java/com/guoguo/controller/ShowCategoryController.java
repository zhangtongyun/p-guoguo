package com.guoguo.controller;

import com.guoguo.common.JsonResult;
import com.guoguo.service.ShowCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lenovo on 2018/4/23.
 */
@Controller
@RequestMapping("showCategory")
public class ShowCategoryController {

    @Autowired
    private ShowCategoryService showCategoryService;

    @RequestMapping("getLevOne")
    @ResponseBody
    public JsonResult getLevOne(){
        return JsonResult.newSuccess(showCategoryService.getLevOne(),"查询成功");
    }
}

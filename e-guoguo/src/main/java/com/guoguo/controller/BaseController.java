package com.guoguo.controller;

import com.guoguo.bean.User;
import com.guoguo.respVo.ShowCategoryResp;
import com.guoguo.service.ShowCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2018/2/26.
 */
@RequestMapping("/base")
@Controller
public class BaseController {

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected ShowCategoryService showCategoryService;

    protected User getLoginUser(){

        return (User)request.getSession().getAttribute("userInfo");
    }

    /**
     * 获取一级分类
     * @return
     */
    protected List<ShowCategoryResp> getLevOneCategory(){
        return showCategoryService.getLevOneCategory();
    }


}

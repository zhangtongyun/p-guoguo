package com.guoguo.controller;

import com.guoguo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/2/26.
 */
@RequestMapping("/base")
@Controller
public class BaseController {

    @Autowired
    protected HttpServletRequest request;

    protected User getLoginUser(){

        return (User)request.getSession().getAttribute("userInfo");
    }
}

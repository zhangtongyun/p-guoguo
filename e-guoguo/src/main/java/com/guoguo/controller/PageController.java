package com.guoguo.controller;

import com.guoguo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 视图控制器,返回jsp视图给前端
 *
 **/
@Controller
public class PageController {

    /**
     * 登录页
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * dashboard页
     */
    @RequestMapping("/dashboard")
    public String dashboard(ModelMap model) {
        model.addAttribute("sss","ssfaf");
        return "dashboard";
    }

    /**
     * 首页
     *
     * @param request
     * @return
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request,Model model) {

       User userInfo = (User)request.getSession().getAttribute("userInfo");
        model.addAttribute("userInfo", userInfo);
        model.addAttribute("aaa","sdfsa");
        request.setAttribute("sss","eeee");
        return "index";
    }
    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }

}
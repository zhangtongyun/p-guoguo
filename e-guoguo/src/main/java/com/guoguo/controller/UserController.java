package com.guoguo.controller;

import com.github.pagehelper.PageHelper;
import com.guoguo.bean.User;
import com.guoguo.reqsVo.TestVo;
import com.guoguo.reqsVo.UserCreateVo;
import com.guoguo.reqsVo.UserVo;
import com.guoguo.resVo.JsonResult;
import com.guoguo.resVo.JsonResultPage;
import com.guoguo.resVo.Test;
import com.guoguo.resVo.UserResp;
import com.guoguo.service.UserService;
import com.guoguo.util.PermissionSign;
import com.guoguo.util.RoleSign;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户控制器
 *
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    /**
     * 用户登录
     * 
     * @param user
     * @param result
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
        try {
            Subject subject = SecurityUtils.getSubject();
            // 已登陆则 跳到首页
            if (subject.isAuthenticated()) {
                return "redirect:/";
            }
            if (result.hasErrors()) {
                model.addAttribute("error", "参数错误！");
                return "login";
            }
            // 身份验证
            subject.login(new UsernamePasswordToken(user.getUserName(), user.getPassword()));
            // 验证成功在Session中保存用户信息
            final User authUserInfo = userService.selectByUsername(user.getUserName());
            request.getSession().setAttribute("userInfo", authUserInfo);
        } catch (AuthenticationException e) {
            // 身份验证失败
            model.addAttribute("error", "用户名或密码错误 ！");
            return "login";
        }
        return "redirect:/";
    }

    /**
     * 用户登出
     * 
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("userInfo");
        // 登出操作
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    /**
     * 基于角色 标识的权限控制案例
     */
    @RequestMapping(value = "/admin")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public String admin() {
        return "拥有admin角色,能访问";
    }

    /**
     * 基于权限标识的权限控制案例
     */
    @RequestMapping(value = "/create")
    @ResponseBody
    @RequiresPermissions(value = PermissionSign.USER_CREATE)
    public String create() {
        return "拥有user:create权限,能访问";
    }

    @RequestMapping(value = "/grid", method = RequestMethod.GET)
    public String grid(HttpSession session) {

        return "user/user";
    }

    @RequestMapping(value = "/getList",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<List<UserResp>> getList(@RequestBody UserVo vo){

        return userService.getList(vo);
    }

    @RequestMapping(value = "/createUser",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<Integer> createUser(@RequestBody UserCreateVo createVo){

        JsonResult<Integer> result = new JsonResult<>();
        User user = getLoginUser();
        if(null == user){
            result.setOk(false);
            result.setResDescription("未登录");
            return result;
        }
        createVo.setCreateOperator(user.getUserName());
        return userService.createUser(createVo);
    }

    @RequestMapping(value = "/delUser",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<Integer> delUser(@RequestBody List<UserCreateVo> createVo){

        JsonResult<Integer> result = new JsonResult<>();
        User user = getLoginUser();
        if(null == user){
            result.setOk(false);
            result.setResDescription("未登录");
            return result;
        }
        List<Integer> ids = createVo.stream().map(UserCreateVo::getId).collect(Collectors.toList());
        int i = userService.delUser(ids,user.getUserName());
        result.setOk(true);
        result.setResDescription("删除成功");
        result.setRows(i);
        return result;
    }

    @RequestMapping(value = "/editUser",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<Integer> editUser(@RequestBody UserCreateVo createVo){

        JsonResult<Integer> result = new JsonResult<>();
        User user = getLoginUser();
        if(null == user){
            result.setOk(false);
            result.setResDescription("未登录");
            return result;
        }
        createVo.setCreateOperator(user.getUserName());
        return userService.editUser(createVo);
    }
}

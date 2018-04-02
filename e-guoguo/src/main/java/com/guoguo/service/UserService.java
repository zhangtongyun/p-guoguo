package com.guoguo.service;

import com.guoguo.bean.User;
import com.guoguo.reqsVo.UserCreateVo;
import com.guoguo.reqsVo.UserVo;
import com.guoguo.resVo.JsonResult;
import com.guoguo.resVo.JsonResultPage;
import com.guoguo.resVo.UserResp;

import java.util.List;

/**
 * Created by lenovo on 2018/1/30.
 */
public interface UserService {

    /**
     * 用户验证
     *
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User selectByUsername(String username);

    JsonResultPage<List<UserResp>> getList(UserVo vo);

    JsonResult<Integer> createUser(UserCreateVo createVo);

    Integer delUser(List<Integer> ids,String operator);

    JsonResult<Integer> editUser(UserCreateVo vo);
}

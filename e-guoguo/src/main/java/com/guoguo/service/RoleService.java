package com.guoguo.service;

import com.guoguo.bean.Role;

import java.util.List;

/**
 * 角色 业务接口
 *
 **/
public interface RoleService {
    /**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Integer userId);
}

package com.guoguo.service;

import com.guoguo.bean.Permission;

import java.util.List;

/**
 * 权限 业务接口
 **/
public interface PermissionService {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Integer roleId);

}

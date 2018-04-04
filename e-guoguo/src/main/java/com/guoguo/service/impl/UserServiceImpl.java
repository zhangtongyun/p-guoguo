package com.guoguo.service.impl;

import com.github.pagehelper.PageHelper;
import com.guoguo.bean.User;
import com.guoguo.bean.UserExample;
import com.guoguo.mapper.UserMapper;
import com.guoguo.reqsVo.UserCreateVo;
import com.guoguo.reqsVo.UserVo;
import com.guoguo.respVo.JsonResult;
import com.guoguo.respVo.JsonResultPage;
import com.guoguo.respVo.UserResp;
import com.guoguo.service.UserService;
import com.guoguo.util.UtilClass;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/1/30.
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

    @Override
    public JsonResultPage<List<UserResp>> getList(UserVo vo) {

        com.github.pagehelper.Page pagehelper = PageHelper.startPage(vo.getPage(), vo.getLimit());
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andStateEqualTo(vo.getStatusQ());
        if(StringUtils.isNotBlank(vo.getName()))
            criteria.andUserNameEqualTo(vo.getName());
        if(StringUtils.isNotBlank(vo.getSortName()))
            example.setOrderByClause(vo.getSortName() + " " +vo.getSortOrder());
        List<User> list = userMapper.selectByExample(example);
        List<UserResp> resps = new ArrayList<>();
        for(User user:list){
            UserResp resp = new UserResp();
            BeanUtils.copyProperties(user,resp);
            resps.add(resp);
        }
        JsonResultPage<List<UserResp>> resultPage = new JsonResultPage<>();
        resultPage.setTotal((int)pagehelper.getTotal());
        resultPage.setRows(resps);
        resultPage.setResDescription("查询成功");
        resultPage.setOk(true);
        return resultPage;
    }

    @Override
    public JsonResult<Integer> createUser(UserCreateVo createVo) {
        JsonResult<Integer> result = new JsonResult<Integer>();
        if(StringUtils.isBlank(createVo.getUserName()) || StringUtils.isBlank(createVo.getPassword())
                || StringUtils.isBlank(createVo.getShowName())){
            result.setOk(false);
            result.setResDescription("信息不完整");
            return result;
        }
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(createVo.getUserName());
        List<User> list = userMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(list)){
            result.setOk(false);
            result.setResDescription("用户已存在");
            return result;
        }
        User user = new User();
        BeanUtils.copyProperties(createVo,user);
        user.setState(createVo.getStatus());
        result.setResDescription("添加成功");
        result.setRows(userMapper.insertSelective(user));
        result.setOk(true);
        return result;
    }

    @Override
    public Integer delUser(List<Integer> ids,String operator) {
        if(CollectionUtils.isEmpty(ids))
            return 0;
        return userMapper.delUser(ids,operator);
    }

    @Override
    public JsonResult<Integer> editUser(UserCreateVo vo) {
        JsonResult<Integer> result = new JsonResult<Integer>();
        User user = new User();
        BeanUtils.copyProperties(vo,user);
        user.setState(vo.getStatus());
        user.setPassword(StringUtils.isEmpty(user.getPassword())?null:user.getPassword());
        result.setResDescription("修改成功");
        result.setRows(userMapper.updateByPrimaryKeySelective(user));
        result.setOk(true);
        return result;
    }
}

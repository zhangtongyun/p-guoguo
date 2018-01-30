package com.guoguo.service.impl;

import com.guoguo.bean.User;
import com.guoguo.mapper.UserMapper;
import com.guoguo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2018/1/30.
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Integer id) {
        logger.info("***************************"+id);
        return userMapper.selectByPrimaryKey(id);
    }
}

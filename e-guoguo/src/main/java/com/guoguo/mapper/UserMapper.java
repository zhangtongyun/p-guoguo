package com.guoguo.mapper;

import java.util.List;

import com.guoguo.bean.User;
import com.guoguo.bean.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 用户登录验证查询
     *
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

    /**
     * 分页条件查询
     *
     * @param page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(Page<User> page, UserExample example);

    Integer delUser(@Param("ids") List<Integer> ids,@Param("operator") String operator);
}
package com.guoguo.mapper;

import com.guoguo.bean.SystemCode;
import com.guoguo.bean.SystemCodeExample;
import java.util.List;

public interface SystemCodeMapper {
    long countByExample(SystemCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemCode record);

    int insertSelective(SystemCode record);

    List<SystemCode> selectByExample(SystemCodeExample example);

    SystemCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemCode record);

    int updateByPrimaryKey(SystemCode record);
}
package com.guoguo.mapper;

import com.guoguo.bean.ShowCategory;
import com.guoguo.bean.ShowCategoryExample;
import java.util.List;

public interface ShowCategoryMapper {
    long countByExample(ShowCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(ShowCategory record);

    int insertSelective(ShowCategory record);

    List<ShowCategory> selectByExample(ShowCategoryExample example);

    ShowCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(ShowCategory record);

    int updateByPrimaryKey(ShowCategory record);
}
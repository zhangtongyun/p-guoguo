package com.guoguo.mapper;

import com.guoguo.bean.NationCode;
import com.guoguo.bean.NationCodeExample;
import java.util.List;

public interface NationCodeMapper {
    long countByExample(NationCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NationCode record);

    int insertSelective(NationCode record);

    List<NationCode> selectByExample(NationCodeExample example);

    NationCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NationCode record);

    int updateByPrimaryKey(NationCode record);
}
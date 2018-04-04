package com.guoguo.mapper;

import com.guoguo.bean.NationRegion;
import com.guoguo.bean.NationRegionExample;
import java.util.List;

public interface NationRegionMapper {
    long countByExample(NationRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NationRegion record);

    int insertSelective(NationRegion record);

    List<NationRegion> selectByExample(NationRegionExample example);

    NationRegion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NationRegion record);

    int updateByPrimaryKey(NationRegion record);
}
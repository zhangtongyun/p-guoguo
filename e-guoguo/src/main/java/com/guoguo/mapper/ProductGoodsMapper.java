package com.guoguo.mapper;

import com.guoguo.bean.ProductGoods;
import com.guoguo.bean.ProductGoodsExample;
import java.util.List;

public interface ProductGoodsMapper {
    long countByExample(ProductGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductGoods record);

    int insertSelective(ProductGoods record);

    List<ProductGoods> selectByExample(ProductGoodsExample example);

    ProductGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductGoods record);

    int updateByPrimaryKey(ProductGoods record);
}
package com.guoguo.reqsVo;


/**
 * Created by lenovo on 2018/4/23.
 */
public class ProductGoodsQueryVo extends QueryPageBaseVo {

    private static final long serialVersionUID = -7419858847022003897L;

    private Integer categoryId;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}

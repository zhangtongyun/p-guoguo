package com.guoguo.respVo;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/4/23.
 */
public class ProductGoodsResp implements Serializable {
    private static final long serialVersionUID = 4600272406657917835L;

    private Integer id;

    private String goods_name;

    private String second_name;

    private String goods_model;

    private String color;

    private String standard;

    private String standard_unit;

    private String pic_url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getGoods_model() {
        return goods_model;
    }

    public void setGoods_model(String goods_model) {
        this.goods_model = goods_model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getStandard_unit() {
        return standard_unit;
    }

    public void setStandard_unit(String standard_unit) {
        this.standard_unit = standard_unit;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }
}

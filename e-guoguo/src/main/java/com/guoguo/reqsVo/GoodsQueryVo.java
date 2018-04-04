package com.guoguo.reqsVo;

/**
 * Created by lenovo on 2018/4/2.
 */
public class GoodsQueryVo extends QueryPageBaseVo {

    private static final long serialVersionUID = 3101564363156412586L;
    private Integer id;

    private String goodsName;

    private Byte saleStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Byte getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }
}

package com.guoguo.respVo;

import com.guoguo.bean.ProductGoods;

/**
 * Created by lenovo on 2018/4/2.
 */
public class GoodsResp extends ProductGoods {

    private static final long serialVersionUID = -1252710437012398208L;
    private String standardUnitName;

    private String chargeUnitName;

    private String lvInfoName;

    public String getStandardUnitName() {
        return standardUnitName;
    }

    public void setStandardUnitName(String standardUnitName) {
        this.standardUnitName = standardUnitName;
    }

    public String getChargeUnitName() {
        return chargeUnitName;
    }

    public void setChargeUnitName(String chargeUnitName) {
        this.chargeUnitName = chargeUnitName;
    }

    public String getLvInfoName() {
        return lvInfoName;
    }

    public void setLvInfoName(String lvInfoName) {
        this.lvInfoName = lvInfoName;
    }
}

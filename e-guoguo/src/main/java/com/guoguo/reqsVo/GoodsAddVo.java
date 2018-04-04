package com.guoguo.reqsVo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by lenovo on 2018/4/2.
 */
public class GoodsAddVo implements Serializable {

    private static final long serialVersionUID = -229126597072342162L;
    private Integer id;

    /**
     *
     */
    private String goodsName;

    /**
     * 标语
     */
    private String secondName;

    /**
     * 商品型号
     */
    private String goodsModel;

    /**
     * 颜色
     */
    private String color;

    /**
     * 规格
     */
    private String standard;

    /**
     * 规格单位
     */
    private String standardUnit;

    /**
     * 计价单位
     */
    private String chargeUnit;

    /**
     * 基材
     */
    private String material1;

    /**
     * 辅材
     */
    private String material2;

    /**
     * 饰面
     */
    private String material3;

    /**
     * 市场参考价
     */
    private BigDecimal marketPrice;

    /**
     * 等级
     */
    private Byte lvInfo;

    /**
     * 分类
     */
    private Integer categoryId;

    /**
     *
     */
    private String categoryName;

    /**
     * 产地国家
     */
    private String countryId;

    /**
     *
     */
    private String countryName;

    /**
     * 产地省
     */
    private String provinceId;

    /**
     *
     */
    private String provinceName;

    /**
     * 产地市
     */
    private String cityId;

    /**
     *
     */
    private String cityName;

    /**
     * 销售状态（0：下架；1：上架）
     */
    private Byte saleStatus;

    /**
     * 二维码
     */
    private String barCode;

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     */
    private Byte isDel;

    private String createOperator;


    /**
     *
     */
    private String updateOperator;


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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
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

    public String getStandardUnit() {
        return standardUnit;
    }

    public void setStandardUnit(String standardUnit) {
        this.standardUnit = standardUnit;
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public String getMaterial1() {
        return material1;
    }

    public void setMaterial1(String material1) {
        this.material1 = material1;
    }

    public String getMaterial2() {
        return material2;
    }

    public void setMaterial2(String material2) {
        this.material2 = material2;
    }

    public String getMaterial3() {
        return material3;
    }

    public void setMaterial3(String material3) {
        this.material3 = material3;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Byte getLvInfo() {
        return lvInfo;
    }

    public void setLvInfo(Byte lvInfo) {
        this.lvInfo = lvInfo;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Byte getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator;
    }

    public String getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(String updateOperator) {
        this.updateOperator = updateOperator;
    }
}

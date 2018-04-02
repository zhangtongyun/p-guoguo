package com.guoguo.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProductGoods implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String googsName;

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

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private String createOperator;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 
     */
    private String updateOperator;

    /**
     * product_goods
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return googs_name 
     */
    public String getGoogsName() {
        return googsName;
    }

    /**
     * 
     * @param googsName 
     */
    public void setGoogsName(String googsName) {
        this.googsName = googsName == null ? null : googsName.trim();
    }

    /**
     * 标语
     * @return second_name 标语
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * 标语
     * @param secondName 标语
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName == null ? null : secondName.trim();
    }

    /**
     * 商品型号
     * @return goods_model 商品型号
     */
    public String getGoodsModel() {
        return goodsModel;
    }

    /**
     * 商品型号
     * @param goodsModel 商品型号
     */
    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel == null ? null : goodsModel.trim();
    }

    /**
     * 颜色
     * @return color 颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 颜色
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * 规格
     * @return standard 规格
     */
    public String getStandard() {
        return standard;
    }

    /**
     * 规格
     * @param standard 规格
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * 规格单位
     * @return standard_unit 规格单位
     */
    public String getStandardUnit() {
        return standardUnit;
    }

    /**
     * 规格单位
     * @param standardUnit 规格单位
     */
    public void setStandardUnit(String standardUnit) {
        this.standardUnit = standardUnit == null ? null : standardUnit.trim();
    }

    /**
     * 计价单位
     * @return charge_unit 计价单位
     */
    public String getChargeUnit() {
        return chargeUnit;
    }

    /**
     * 计价单位
     * @param chargeUnit 计价单位
     */
    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit == null ? null : chargeUnit.trim();
    }

    /**
     * 基材
     * @return material_1 基材
     */
    public String getMaterial1() {
        return material1;
    }

    /**
     * 基材
     * @param material1 基材
     */
    public void setMaterial1(String material1) {
        this.material1 = material1 == null ? null : material1.trim();
    }

    /**
     * 辅材
     * @return material_2 辅材
     */
    public String getMaterial2() {
        return material2;
    }

    /**
     * 辅材
     * @param material2 辅材
     */
    public void setMaterial2(String material2) {
        this.material2 = material2 == null ? null : material2.trim();
    }

    /**
     * 饰面
     * @return material_3 饰面
     */
    public String getMaterial3() {
        return material3;
    }

    /**
     * 饰面
     * @param material3 饰面
     */
    public void setMaterial3(String material3) {
        this.material3 = material3 == null ? null : material3.trim();
    }

    /**
     * 市场参考价
     * @return market_price 市场参考价
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * 市场参考价
     * @param marketPrice 市场参考价
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 等级
     * @return lv_info 等级
     */
    public Byte getLvInfo() {
        return lvInfo;
    }

    /**
     * 等级
     * @param lvInfo 等级
     */
    public void setLvInfo(Byte lvInfo) {
        this.lvInfo = lvInfo;
    }

    /**
     * 分类
     * @return category_id 分类
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 分类
     * @param categoryId 分类
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 
     * @return category_name 
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 
     * @param categoryName 
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 产地国家
     * @return country_id 产地国家
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * 产地国家
     * @param countryId 产地国家
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId == null ? null : countryId.trim();
    }

    /**
     * 
     * @return country_name 
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName 
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /**
     * 产地省
     * @return province_id 产地省
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 产地省
     * @param provinceId 产地省
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 
     * @return province_name 
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 
     * @param provinceName 
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * 产地市
     * @return city_id 产地市
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 产地市
     * @param cityId 产地市
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 
     * @return city_name 
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName 
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 销售状态（0：下架；1：上架）
     * @return sale_status 销售状态（0：下架；1：上架）
     */
    public Byte getSaleStatus() {
        return saleStatus;
    }

    /**
     * 销售状态（0：下架；1：上架）
     * @param saleStatus 销售状态（0：下架；1：上架）
     */
    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    /**
     * 二维码
     * @return bar_code 二维码
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * 二维码
     * @param barCode 二维码
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     * @return is_del 删除状态，0：未删除,1:已删除,2:无效
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     * @param isDel 删除状态，0：未删除,1:已删除,2:无效
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 
     * @return create_date 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 
     * @param createDate 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 
     * @return create_operator 
     */
    public String getCreateOperator() {
        return createOperator;
    }

    /**
     * 
     * @param createOperator 
     */
    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }

    /**
     * 
     * @return update_date 
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 
     * @param updateDate 
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 
     * @return update_operator 
     */
    public String getUpdateOperator() {
        return updateOperator;
    }

    /**
     * 
     * @param updateOperator 
     */
    public void setUpdateOperator(String updateOperator) {
        this.updateOperator = updateOperator == null ? null : updateOperator.trim();
    }
}
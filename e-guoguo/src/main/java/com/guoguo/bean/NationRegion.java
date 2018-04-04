package com.guoguo.bean;

import java.io.Serializable;
import java.util.Date;

public class NationRegion implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 国家代码
     */
    private String nationCode;

    /**
     * 国家名称
     */
    private String nationName;

    /**
     * 大区--东北、华北、华东、西南等
     */
    private String area;

    /**
     * 地区名称中文名
     */
    private String adress;

    /**
     * 地区代码
     */
    private String adressCode;

    /**
     * 上级地区代码
     */
    private String parentCode;

    /**
     * 上级地区附代码
     */
    private String parentCode2;

    /**
     * 是否删除　０否　１是
     */
    private Byte isDel;

    /**
     * 插入时间
     */
    private Date insertTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 地区别称
     */
    private String adressAlias;

    /**
     * 地区简写
     */
    private String adressShort;

    /**
     * nation_region
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
     * 国家代码
     * @return nation_code 国家代码
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * 国家代码
     * @param nationCode 国家代码
     */
    public void setNationCode(String nationCode) {
        this.nationCode = nationCode == null ? null : nationCode.trim();
    }

    /**
     * 国家名称
     * @return nation_name 国家名称
     */
    public String getNationName() {
        return nationName;
    }

    /**
     * 国家名称
     * @param nationName 国家名称
     */
    public void setNationName(String nationName) {
        this.nationName = nationName == null ? null : nationName.trim();
    }

    /**
     * 大区--东北、华北、华东、西南等
     * @return area 大区--东北、华北、华东、西南等
     */
    public String getArea() {
        return area;
    }

    /**
     * 大区--东北、华北、华东、西南等
     * @param area 大区--东北、华北、华东、西南等
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 地区名称中文名
     * @return adress 地区名称中文名
     */
    public String getAdress() {
        return adress;
    }

    /**
     * 地区名称中文名
     * @param adress 地区名称中文名
     */
    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    /**
     * 地区代码
     * @return adress_code 地区代码
     */
    public String getAdressCode() {
        return adressCode;
    }

    /**
     * 地区代码
     * @param adressCode 地区代码
     */
    public void setAdressCode(String adressCode) {
        this.adressCode = adressCode == null ? null : adressCode.trim();
    }

    /**
     * 上级地区代码
     * @return parent_code 上级地区代码
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 上级地区代码
     * @param parentCode 上级地区代码
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * 上级地区附代码
     * @return parent_code2 上级地区附代码
     */
    public String getParentCode2() {
        return parentCode2;
    }

    /**
     * 上级地区附代码
     * @param parentCode2 上级地区附代码
     */
    public void setParentCode2(String parentCode2) {
        this.parentCode2 = parentCode2 == null ? null : parentCode2.trim();
    }

    /**
     * 是否删除　０否　１是
     * @return is_del 是否删除　０否　１是
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 是否删除　０否　１是
     * @param isDel 是否删除　０否　１是
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 插入时间
     * @return insert_time 插入时间
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * 插入时间
     * @param insertTime 插入时间
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 地区别称
     * @return adress_alias 地区别称
     */
    public String getAdressAlias() {
        return adressAlias;
    }

    /**
     * 地区别称
     * @param adressAlias 地区别称
     */
    public void setAdressAlias(String adressAlias) {
        this.adressAlias = adressAlias == null ? null : adressAlias.trim();
    }

    /**
     * 地区简写
     * @return adress_short 地区简写
     */
    public String getAdressShort() {
        return adressShort;
    }

    /**
     * 地区简写
     * @param adressShort 地区简写
     */
    public void setAdressShort(String adressShort) {
        this.adressShort = adressShort == null ? null : adressShort.trim();
    }
}
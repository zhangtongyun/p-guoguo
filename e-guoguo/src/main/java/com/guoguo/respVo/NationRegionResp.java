package com.guoguo.respVo;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/4/4.
 */
public class NationRegionResp implements Serializable {
    private static final long serialVersionUID = 8727471865758826354L;

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
     * 地区别称
     */
    private String adressAlias;

    /**
     * 地区简写
     */
    private String adressShort;

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdressCode() {
        return adressCode;
    }

    public void setAdressCode(String adressCode) {
        this.adressCode = adressCode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentCode2() {
        return parentCode2;
    }

    public void setParentCode2(String parentCode2) {
        this.parentCode2 = parentCode2;
    }

    public String getAdressAlias() {
        return adressAlias;
    }

    public void setAdressAlias(String adressAlias) {
        this.adressAlias = adressAlias;
    }

    public String getAdressShort() {
        return adressShort;
    }

    public void setAdressShort(String adressShort) {
        this.adressShort = adressShort;
    }
}

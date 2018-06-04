package com.guoguo.bean;

import java.io.Serializable;
import java.util.Date;

public class NationCode implements Serializable {
    /**
     * 自増主键
     */
    private Integer id;

    /**
     * 国家代码，如中国的代码　CN
     */
    private String nationCode;

    /**
     * 国家中文名称
     */
    private String nationName;

    /**
     * 国家英文名称
     */
    private String nationEng;

    /**
     * 国家座机前缀号码
     */
    private String nationPhoneCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否可展开，关联区域表的时候，是否有下级地区，目前只有中国可展开。０　可展开　１不可展开
     */
    private Byte isExpand;

    /**
     * 是否删除　０　否　１　是
     */
    private Byte isDel;

    /**
     * nation_code
     */
    private static final long serialVersionUID = 1L;

    /**
     * 自増主键
     * @return id 自増主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自増主键
     * @param id 自増主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 国家代码，如中国的代码　CN
     * @return nation_code 国家代码，如中国的代码　CN
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * 国家代码，如中国的代码　CN
     * @param nationCode 国家代码，如中国的代码　CN
     */
    public void setNationCode(String nationCode) {
        this.nationCode = nationCode == null ? null : nationCode.trim();
    }

    /**
     * 国家中文名称
     * @return nation_name 国家中文名称
     */
    public String getNationName() {
        return nationName;
    }

    /**
     * 国家中文名称
     * @param nationName 国家中文名称
     */
    public void setNationName(String nationName) {
        this.nationName = nationName == null ? null : nationName.trim();
    }

    /**
     * 国家英文名称
     * @return nation_eng 国家英文名称
     */
    public String getNationEng() {
        return nationEng;
    }

    /**
     * 国家英文名称
     * @param nationEng 国家英文名称
     */
    public void setNationEng(String nationEng) {
        this.nationEng = nationEng == null ? null : nationEng.trim();
    }

    /**
     * 国家座机前缀号码
     * @return nation_phone_code 国家座机前缀号码
     */
    public String getNationPhoneCode() {
        return nationPhoneCode;
    }

    /**
     * 国家座机前缀号码
     * @param nationPhoneCode 国家座机前缀号码
     */
    public void setNationPhoneCode(String nationPhoneCode) {
        this.nationPhoneCode = nationPhoneCode == null ? null : nationPhoneCode.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 是否可展开，关联区域表的时候，是否有下级地区，目前只有中国可展开。０　可展开　１不可展开
     * @return is_expand 是否可展开，关联区域表的时候，是否有下级地区，目前只有中国可展开。０　可展开　１不可展开
     */
    public Byte getIsExpand() {
        return isExpand;
    }

    /**
     * 是否可展开，关联区域表的时候，是否有下级地区，目前只有中国可展开。０　可展开　１不可展开
     * @param isExpand 是否可展开，关联区域表的时候，是否有下级地区，目前只有中国可展开。０　可展开　１不可展开
     */
    public void setIsExpand(Byte isExpand) {
        this.isExpand = isExpand;
    }

    /**
     * 是否删除　０　否　１　是
     * @return is_del 是否删除　０　否　１　是
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 是否删除　０　否　１　是
     * @param isDel 是否删除　０　否　１　是
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
}
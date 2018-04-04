package com.guoguo.respVo;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/4/4.
 */
public class NationCodeResp implements Serializable {
    private static final long serialVersionUID = -1999871735605929262L;
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

    public String getNationEng() {
        return nationEng;
    }

    public void setNationEng(String nationEng) {
        this.nationEng = nationEng;
    }
}

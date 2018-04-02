package com.guoguo.resVo;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/2/7.
 */
public class Test implements Serializable {
    private static final long serialVersionUID = -7059016279741214161L;

    private String bmmc;

    private String sjbm;

    private Integer bmjb;

    private String ms;

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    public String getSjbm() {
        return sjbm;
    }

    public void setSjbm(String sjbm) {
        this.sjbm = sjbm;
    }

    public Integer getBmjb() {
        return bmjb;
    }

    public void setBmjb(Integer bmjb) {
        this.bmjb = bmjb;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }
}

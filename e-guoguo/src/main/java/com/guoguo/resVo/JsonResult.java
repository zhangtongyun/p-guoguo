package com.guoguo.resVo;

import common.Constants;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/2/8.
 */
public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = 7699897781952697444L;

    private boolean isOk;

    private String resCode = Constants.SUCCESS_CODE;

    private String resDescription;

    private T rows;

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean isOk) {
        this.isOk = isOk;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResDescription() {
        return resDescription;
    }

    public void setResDescription(String resDescription) {
        this.resDescription = resDescription;
    }

    public T getRows() {
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }
}

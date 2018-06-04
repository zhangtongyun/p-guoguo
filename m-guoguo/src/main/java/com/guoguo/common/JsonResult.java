package com.guoguo.common;

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

    public JsonResult(){

    }

    public JsonResult(boolean isOk,T rows){
        this.isOk = isOk;
        this.rows = rows;
    }

    public JsonResult(boolean isOk,T rows,String resCode,String resDescription){
        this.isOk = isOk;
        this.rows = rows;
        this.resCode = resCode;
        this.resDescription = resDescription;
    }

    public static <T> JsonResult<T> newSuccess(T rows,String resDescription){

        return new JsonResult<>(true,rows,Constants.SUCCESS_CODE,resDescription);
    }

    public static <T> JsonResult<T> newError(String resCode,String resDescription){

        return new JsonResult<T>(false,null,resCode,resDescription);
    }
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

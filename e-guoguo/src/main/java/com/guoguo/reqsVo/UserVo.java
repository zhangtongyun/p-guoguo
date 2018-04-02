package com.guoguo.reqsVo;

/**
 * Created by lenovo on 2018/2/25.
 */
public class UserVo extends QueryPageBaseVo {

    private String name;

    private String statusQ ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatusQ() {
        return statusQ;
    }

    public void setStatusQ(String statusQ) {
        this.statusQ = statusQ;
    }
}

package com.guoguo.reqsVo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * Created by lenovo on 2018/2/8.
 */
public class TestVo extends QueryPageBaseVo implements Serializable {
    private static final long serialVersionUID = -4971062484195528446L;

    private String input;

    private Integer select1;

    private List<Integer> select2;

    private Date datetime;

    private Date datetimeStart;

    private Date datetimeEnd;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Integer getSelect1() {
        return select1;
    }

    public void setSelect1(Integer select1) {
        this.select1 = select1;
    }

    public List<Integer> getSelect2() {
        return select2;
    }

    public void setSelect2(List<Integer> select2) {
        this.select2 = select2;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getDatetimeStart() {
        return datetimeStart;
    }

    public void setDatetimeStart(Date datetimeStart) {
        this.datetimeStart = datetimeStart;
    }

    public Date getDatetimeEnd() {
        return datetimeEnd;
    }

    public void setDatetimeEnd(Date datetimeEnd) {
        this.datetimeEnd = datetimeEnd;
    }
}

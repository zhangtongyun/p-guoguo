package com.guoguo.respVo;

import java.io.Serializable;
import java.util.Date;

public class UserResp implements Serializable {

    private static final long serialVersionUID = -1288011673918629688L;
    private Integer id;

    private String userName;

    private String  showName;

    private String password;

    private String state;

    private Date createTime;

    private String createOperator;
    public UserResp() {

    }

    public UserResp(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator;
    }
}
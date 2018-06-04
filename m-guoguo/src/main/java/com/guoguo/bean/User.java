package com.guoguo.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String showName;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String state;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createOperator;

    /**
     * user
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
     * 
     * @return user_name 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 
     * @return show_name 
     */
    public String getShowName() {
        return showName;
    }

    /**
     * 
     * @param showName 
     */
    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

    /**
     * 
     * @return password 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 
     * @return state 
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state 
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return create_operator 
     */
    public String getCreateOperator() {
        return createOperator;
    }

    /**
     * 
     * @param createOperator 
     */
    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }
}
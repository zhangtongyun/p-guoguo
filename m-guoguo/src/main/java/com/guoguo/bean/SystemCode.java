package com.guoguo.bean;

import java.io.Serializable;
import java.util.Date;

public class SystemCode implements Serializable {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 编码类型
     */
    private String codeType;

    /**
     * 编码类型名称
     */
    private String codeTypeName;

    /**
     * 编码值
     */
    private String codeValueCode;

    /**
     * 
     */
    private String codeValueName;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 创建时间
     */
    private Date createDatetime;

    /**
     * 创建者
     */
    private String createOperator;

    /**
     * 更新时间
     */
    private Date updateDatetime;

    /**
     * 更新者
     */
    private String updateOperator;

    /**
     * 状态(0：作废，1：启用)
     */
    private Integer status;

    /**
     * system_code
     */
    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     * @return id 自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增ID
     * @param id 自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 编码类型
     * @return code_type 编码类型
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * 编码类型
     * @param codeType 编码类型
     */
    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    /**
     * 编码类型名称
     * @return code_type_name 编码类型名称
     */
    public String getCodeTypeName() {
        return codeTypeName;
    }

    /**
     * 编码类型名称
     * @param codeTypeName 编码类型名称
     */
    public void setCodeTypeName(String codeTypeName) {
        this.codeTypeName = codeTypeName == null ? null : codeTypeName.trim();
    }

    /**
     * 编码值
     * @return code_value_code 编码值
     */
    public String getCodeValueCode() {
        return codeValueCode;
    }

    /**
     * 编码值
     * @param codeValueCode 编码值
     */
    public void setCodeValueCode(String codeValueCode) {
        this.codeValueCode = codeValueCode == null ? null : codeValueCode.trim();
    }

    /**
     * 
     * @return code_value_name 
     */
    public String getCodeValueName() {
        return codeValueName;
    }

    /**
     * 
     * @param codeValueName 
     */
    public void setCodeValueName(String codeValueName) {
        this.codeValueName = codeValueName == null ? null : codeValueName.trim();
    }

    /**
     * 排序
     * @return order_num 排序
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 排序
     * @param orderNum 排序
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 创建时间
     * @return create_datetime 创建时间
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * 创建时间
     * @param createDatetime 创建时间
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * 创建者
     * @return create_operator 创建者
     */
    public String getCreateOperator() {
        return createOperator;
    }

    /**
     * 创建者
     * @param createOperator 创建者
     */
    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }

    /**
     * 更新时间
     * @return update_datetime 更新时间
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * 更新时间
     * @param updateDatetime 更新时间
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * 更新者
     * @return update_operator 更新者
     */
    public String getUpdateOperator() {
        return updateOperator;
    }

    /**
     * 更新者
     * @param updateOperator 更新者
     */
    public void setUpdateOperator(String updateOperator) {
        this.updateOperator = updateOperator == null ? null : updateOperator.trim();
    }

    /**
     * 状态(0：作废，1：启用)
     * @return status 状态(0：作废，1：启用)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态(0：作废，1：启用)
     * @param status 状态(0：作废，1：启用)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
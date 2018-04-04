package com.guoguo.bean;

import java.io.Serializable;
import java.util.Date;

public class ShowCategory implements Serializable {
    /**
     * 主键
     */
    private Integer categoryId;

    /**
     * 父分类ID（最顶层是0）
     */
    private Integer categoryParentId;

    /**
     * 分类级别（从1开始）
     */
    private Integer categoryLevel;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 状态(0:未启用；1:启用)
     */
    private Integer useState;

    /**
     * 分类图片地址
     */
    private String imgUrl;

    /**
     * 排序(小的在前)
     */
    private Integer displayOrder;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建者
     */
    private String createOperator;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 更新者
     */
    private String updateOperator;

    /**
     * show_category
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return category_id 主键
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 主键
     * @param categoryId 主键
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 父分类ID（最顶层是0）
     * @return category_parent_id 父分类ID（最顶层是0）
     */
    public Integer getCategoryParentId() {
        return categoryParentId;
    }

    /**
     * 父分类ID（最顶层是0）
     * @param categoryParentId 父分类ID（最顶层是0）
     */
    public void setCategoryParentId(Integer categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    /**
     * 分类级别（从1开始）
     * @return category_level 分类级别（从1开始）
     */
    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * 分类级别（从1开始）
     * @param categoryLevel 分类级别（从1开始）
     */
    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    /**
     * 分类名称
     * @return category_name 分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 分类名称
     * @param categoryName 分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 状态(0:未启用；1:启用)
     * @return use_state 状态(0:未启用；1:启用)
     */
    public Integer getUseState() {
        return useState;
    }

    /**
     * 状态(0:未启用；1:启用)
     * @param useState 状态(0:未启用；1:启用)
     */
    public void setUseState(Integer useState) {
        this.useState = useState;
    }

    /**
     * 分类图片地址
     * @return img_url 分类图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 分类图片地址
     * @param imgUrl 分类图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 排序(小的在前)
     * @return display_order 排序(小的在前)
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * 排序(小的在前)
     * @param displayOrder 排序(小的在前)
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
     * @return update_date 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
}
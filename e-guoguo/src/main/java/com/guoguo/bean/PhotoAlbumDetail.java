package com.guoguo.bean;

import java.io.Serializable;
import java.util.Date;

public class PhotoAlbumDetail implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 相册ID
     */
    private Integer albumId;

    /**
     * 图片标题
     */
    private String photoTitle;

    /**
     * 图片url
     */
    private String picUrl;

    /**
     * 排序，由小到大
     */
    private Integer sort;

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     */
    private Integer isDel;

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
     * photo_album_detail
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
     * 相册ID
     * @return album_id 相册ID
     */
    public Integer getAlbumId() {
        return albumId;
    }

    /**
     * 相册ID
     * @param albumId 相册ID
     */
    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    /**
     * 图片标题
     * @return photo_title 图片标题
     */
    public String getPhotoTitle() {
        return photoTitle;
    }

    /**
     * 图片标题
     * @param photoTitle 图片标题
     */
    public void setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle == null ? null : photoTitle.trim();
    }

    /**
     * 图片url
     * @return pic_url 图片url
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 图片url
     * @param picUrl 图片url
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * 排序，由小到大
     * @return sort 排序，由小到大
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序，由小到大
     * @param sort 排序，由小到大
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     * @return is_del 删除状态，0：未删除,1:已删除,2:无效
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     * @param isDel 删除状态，0：未删除,1:已删除,2:无效
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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
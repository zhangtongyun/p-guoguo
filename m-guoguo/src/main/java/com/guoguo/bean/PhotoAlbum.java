package com.guoguo.bean;

import java.io.Serializable;
import java.util.Date;

public class PhotoAlbum implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 相册名称
     */
    private String albumName;

    /**
     * 封面
     */
    private String picUrl;

    /**
     * 描述
     */
    private String albumDesc;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     */
    private Byte isDel;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private String createOperator;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 
     */
    private String updateOperator;

    /**
     * photo_album
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
     * 商品id
     * @return goods_id 商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id
     * @param goodsId 商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 相册名称
     * @return album_name 相册名称
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * 相册名称
     * @param albumName 相册名称
     */
    public void setAlbumName(String albumName) {
        this.albumName = albumName == null ? null : albumName.trim();
    }

    /**
     * 封面
     * @return pic_url 封面
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 封面
     * @param picUrl 封面
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * 描述
     * @return album_desc 描述
     */
    public String getAlbumDesc() {
        return albumDesc;
    }

    /**
     * 描述
     * @param albumDesc 描述
     */
    public void setAlbumDesc(String albumDesc) {
        this.albumDesc = albumDesc == null ? null : albumDesc.trim();
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     * @return is_del 删除状态，0：未删除,1:已删除,2:无效
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     * @param isDel 删除状态，0：未删除,1:已删除,2:无效
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 
     * @return create_date 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 
     * @param createDate 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    /**
     * 
     * @return update_date 
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 
     * @param updateDate 
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 
     * @return update_operator 
     */
    public String getUpdateOperator() {
        return updateOperator;
    }

    /**
     * 
     * @param updateOperator 
     */
    public void setUpdateOperator(String updateOperator) {
        this.updateOperator = updateOperator == null ? null : updateOperator.trim();
    }
}
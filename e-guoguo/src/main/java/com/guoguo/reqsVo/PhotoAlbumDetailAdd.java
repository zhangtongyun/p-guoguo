package com.guoguo.reqsVo;

import com.guoguo.common.UpdateGroups;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by lenovo on 2018/4/12.
 */
public class PhotoAlbumDetailAdd implements Serializable {

    private static final long serialVersionUID = 8033682571096939553L;
    /**
     *
     */
    @NotNull(message = "id不能为空",groups = {UpdateGroups.class})
    private Integer id;

    /**
     * 相册ID
     */
    @NotNull(message = "相册id不能为空")
    private Integer albumId;

    /**
     * 图片标题
     */
    private String photoTitle;

    /**
     * 图片url
     */
    @NotNull(message = "图片地址不能为空")
    private String picUrl;

    /**
     * 排序，由小到大
     */
    private Integer sort;

    /**
     * 删除状态，0：未删除,1:已删除,2:无效
     */
    private Byte isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getPhotoTitle() {
        return photoTitle;
    }

    public void setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
}

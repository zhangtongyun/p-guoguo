package com.guoguo.respVo;

import com.guoguo.common.UpdateGroups;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by lenovo on 2018/4/11.
 */
public class PhotoAlbumUpdateVo implements Serializable{
    private static final long serialVersionUID = -3241620786741730295L;

    @NotNull(message = "id不能为空",groups = {UpdateGroups.class})
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

    private Byte isDel;

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getAlbumDesc() {
        return albumDesc;
    }

    public void setAlbumDesc(String albumDesc) {
        this.albumDesc = albumDesc;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}

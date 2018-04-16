package com.guoguo.service;

import com.guoguo.bean.PhotoAlbum;
import com.guoguo.bean.PhotoAlbumDetail;
import com.guoguo.reqsVo.PhotoAlbumDetailAdd;
import com.guoguo.respVo.PhotoAlbumDetailResp;

import java.util.List;

/**
 * Created by lenovo on 2018/4/12.
 */
public interface PhotoAlbumDetailService {

    /**
     * 根据相册id获取
     * @param albumId
     * @return
     */
    List<PhotoAlbumDetailResp> getListByAlbumId(Integer albumId);

    int addPhoto(PhotoAlbumDetailAdd add);

    int updatePhoto(PhotoAlbumDetail photoAlbumDetail);
}

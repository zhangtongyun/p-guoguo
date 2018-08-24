package com.guoguo.service;

import com.guoguo.bean.PhotoAlbumDetail;

import java.util.List;

/**
 * Created by lenovo on 2018/8/21.
 */
public interface PhotoAlbumDetailService {

    List<PhotoAlbumDetail> getByAlbumId(Integer albumId);
}

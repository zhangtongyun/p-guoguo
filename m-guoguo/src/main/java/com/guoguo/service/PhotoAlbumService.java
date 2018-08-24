package com.guoguo.service;

import com.guoguo.bean.PhotoAlbum;

import java.util.List;

/**
 * Created by lenovo on 2018/8/21.
 */
public interface PhotoAlbumService {


    List<PhotoAlbum> getByGoodsId(Integer goodsId);
}

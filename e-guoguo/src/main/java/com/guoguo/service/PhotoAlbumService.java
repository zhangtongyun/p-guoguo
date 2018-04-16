package com.guoguo.service;


import com.guoguo.respVo.PhotoAlbumUpdateVo;
import com.guoguo.reqsVo.PhotoAlbumReqs;

import java.util.List;

/**
 * Created by lenovo on 2018/4/11.
 */
public interface PhotoAlbumService {

    List<PhotoAlbumReqs> getList(Integer goodsId);

    int addAlbum(PhotoAlbumUpdateVo vo);

    int updateAlbum(PhotoAlbumUpdateVo vo);

}

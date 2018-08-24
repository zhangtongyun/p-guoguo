package com.guoguo.service.impl;

import com.guoguo.bean.PhotoAlbumDetail;
import com.guoguo.bean.PhotoAlbumDetailExample;
import com.guoguo.common.Constants;
import com.guoguo.mapper.PhotoAlbumDetailMapper;
import com.guoguo.service.PhotoAlbumDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2018/8/21.
 */
@Service
public class PhotoAlbumDetailServiceImpl implements PhotoAlbumDetailService {

    @Autowired
    private PhotoAlbumDetailMapper photoAlbumDetailMapper;
    @Override
    public List<PhotoAlbumDetail> getByAlbumId(Integer albumId) {
        PhotoAlbumDetailExample example = new PhotoAlbumDetailExample();
        example.createCriteria().andAlbumIdEqualTo(albumId).andIsDelEqualTo(Constants.IS_DEL.NO);
        example.setOrderByClause("sort");
        return photoAlbumDetailMapper.selectByExample(example);
    }
}

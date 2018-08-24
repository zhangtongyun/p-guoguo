package com.guoguo.service.impl;

import com.guoguo.bean.PhotoAlbum;
import com.guoguo.bean.PhotoAlbumExample;
import com.guoguo.common.Constants;
import com.guoguo.mapper.PhotoAlbumMapper;
import com.guoguo.service.PhotoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2018/8/21.
 */
@Service
public class PhotoAlbumServiceImpl implements PhotoAlbumService {

    @Autowired
    private PhotoAlbumMapper photoAlbumMapper;

    @Override
    public List<PhotoAlbum> getByGoodsId(Integer goodsId) {
        PhotoAlbumExample example = new PhotoAlbumExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId).andIsDelEqualTo(Constants.IS_DEL.NO);
        example.setOrderByClause("sort");
        return photoAlbumMapper.selectByExample(example);
    }
}

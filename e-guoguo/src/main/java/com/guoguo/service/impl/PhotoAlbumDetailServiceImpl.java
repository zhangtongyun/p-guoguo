package com.guoguo.service.impl;

import com.guoguo.bean.PhotoAlbum;
import com.guoguo.bean.PhotoAlbumDetail;
import com.guoguo.bean.PhotoAlbumDetailExample;
import com.guoguo.common.Constants;
import com.guoguo.mapper.PhotoAlbumDetailMapper;
import com.guoguo.mapper.PhotoAlbumMapper;
import com.guoguo.reqsVo.PhotoAlbumDetailAdd;
import com.guoguo.respVo.PhotoAlbumDetailResp;
import com.guoguo.service.PhotoAlbumDetailService;
import com.guoguo.util.UtilClass;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by lenovo on 2018/4/12.
 */
@Service
public class PhotoAlbumDetailServiceImpl implements PhotoAlbumDetailService {

    @Autowired
    private PhotoAlbumDetailMapper photoAlbumDetailMapper;

    @Autowired
    private PhotoAlbumMapper photoAlbumMapper;

    @Override

    public List<PhotoAlbumDetailResp> getListByAlbumId(Integer albumId) {
        if(null == albumId)
            return Collections.emptyList();
        PhotoAlbumDetailExample example = new PhotoAlbumDetailExample();
        example.createCriteria().andAlbumIdEqualTo(albumId).andIsDelEqualTo(Constants.IS_DEL.NO);
        example.setOrderByClause("sort");
        List<PhotoAlbumDetail> list = photoAlbumDetailMapper.selectByExample(example);
        return UtilClass.copyList(list,PhotoAlbumDetailResp.class);
    }

    @Override
    public int addPhoto(PhotoAlbumDetailAdd add) {
        PhotoAlbum album = photoAlbumMapper.selectByPrimaryKey(add.getAlbumId());
        if(null == album)
            return 0;
        if(StringUtils.isBlank(album.getPicUrl())){
            PhotoAlbum p = new PhotoAlbum();
            p.setId(album.getId());
            p.setPicUrl(add.getPicUrl());
            photoAlbumMapper.updateByPrimaryKeySelective(p);
        }
        PhotoAlbumDetail record = new PhotoAlbumDetail();
        BeanUtils.copyProperties(add,record);
        record.setSort(photoAlbumDetailMapper.maxSort(album.getId()) + 1);
        return photoAlbumDetailMapper.insertSelective(record);
    }

    @Override
    public int updatePhoto(PhotoAlbumDetail photoAlbumDetail) {
        if(null == photoAlbumDetail || null == photoAlbumDetail.getId())
            return 0;
        return photoAlbumDetailMapper.updateByPrimaryKeySelective(photoAlbumDetail);
    }


}

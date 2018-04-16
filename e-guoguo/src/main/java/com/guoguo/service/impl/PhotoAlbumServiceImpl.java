package com.guoguo.service.impl;

import com.guoguo.bean.PhotoAlbum;
import com.guoguo.bean.PhotoAlbumDetailExample;
import com.guoguo.bean.PhotoAlbumExample;
import com.guoguo.common.Constants;
import com.guoguo.mapper.PhotoAlbumDetailMapper;
import com.guoguo.mapper.PhotoAlbumMapper;
import com.guoguo.respVo.PhotoAlbumUpdateVo;
import com.guoguo.reqsVo.PhotoAlbumReqs;
import com.guoguo.service.PhotoAlbumService;
import com.guoguo.util.UtilClass;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by lenovo on 2018/4/11.
 */
@Service
public class PhotoAlbumServiceImpl implements PhotoAlbumService {

    @Autowired
    private PhotoAlbumMapper photoAlbumMapper;

    @Autowired
    private PhotoAlbumDetailMapper photoAlbumDetailMapper;

    @Override
    public List<PhotoAlbumReqs> getList(Integer goodsId) {
        if(null == goodsId)
            return Collections.EMPTY_LIST;
        PhotoAlbumExample example = new PhotoAlbumExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId).andIsDelEqualTo(Constants.IS_DEL.NO);
        example.setOrderByClause("sort");
        List<PhotoAlbum> list = photoAlbumMapper.selectByExample(example);

        return UtilClass.copyList(list,PhotoAlbumReqs.class);
    }

    @Override
    public int addAlbum(PhotoAlbumUpdateVo vo) {
        PhotoAlbum record = new PhotoAlbum();
        BeanUtils.copyProperties(vo,record);
        return photoAlbumMapper.insertSelective(record);
    }

    @Override
    public int updateAlbum(PhotoAlbumUpdateVo vo) {
        if(null == vo || vo.getId() < 1)
            return 0;
        if(null != vo.getIsDel() && vo.getIsDel() == Constants.IS_DEL.YES)
            photoAlbumDetailMapper.deleteByAlbumId(vo.getId());
        PhotoAlbum record = new PhotoAlbum();
        BeanUtils.copyProperties(vo,record);
        return photoAlbumMapper.updateByPrimaryKeySelective(record);
    }
}

package com.guoguo.mapper;

import com.guoguo.bean.PhotoAlbumDetail;
import com.guoguo.bean.PhotoAlbumDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhotoAlbumDetailMapper {
    long countByExample(PhotoAlbumDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhotoAlbumDetail record);

    int insertSelective(PhotoAlbumDetail record);

    List<PhotoAlbumDetail> selectByExample(PhotoAlbumDetailExample example);

    PhotoAlbumDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhotoAlbumDetail record);

    int updateByPrimaryKey(PhotoAlbumDetail record);

    int deleteByAlbumId(@Param("albumId")Integer albumId);

    int maxSort(@Param("albumId")Integer albumId);
}
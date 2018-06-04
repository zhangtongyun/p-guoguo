package com.guoguo.mapper;

import com.guoguo.bean.PhotoAlbum;
import com.guoguo.bean.PhotoAlbumExample;
import java.util.List;

public interface PhotoAlbumMapper {
    long countByExample(PhotoAlbumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhotoAlbum record);

    int insertSelective(PhotoAlbum record);

    List<PhotoAlbum> selectByExample(PhotoAlbumExample example);

    PhotoAlbum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhotoAlbum record);

    int updateByPrimaryKey(PhotoAlbum record);
}
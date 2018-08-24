package com.guoguo.controller;

import com.guoguo.bean.PhotoAlbumDetail;
import com.guoguo.common.JsonResult;
import com.guoguo.service.PhotoAlbumDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lenovo on 2018/8/21.
 */
@RestController
@RequestMapping("/photoAlbumDetail")
public class PhotoAlbumDetailController {

    @Autowired
    private PhotoAlbumDetailService photoAlbumDetailService;

    @RequestMapping(value = "/getAlbumDetail/{albumId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public JsonResult<List<PhotoAlbumDetail>> getAlbumDetail(@PathVariable("albumId") Integer albumId){
        return new JsonResult<>(true,photoAlbumDetailService.getByAlbumId(albumId));
    }
}

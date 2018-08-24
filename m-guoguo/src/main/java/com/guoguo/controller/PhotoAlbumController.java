package com.guoguo.controller;

import com.guoguo.bean.PhotoAlbum;
import com.guoguo.common.JsonResult;
import com.guoguo.service.PhotoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lenovo on 2018/8/21.
 */
@RestController
@RequestMapping("/photoAlbum")
public class PhotoAlbumController {

    @Autowired
    private PhotoAlbumService photoAlbumService;

    @RequestMapping(value = "/getAlbum/{goodsId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public JsonResult<List<PhotoAlbum>> getAlbum(@PathVariable("goodsId") Integer goods){
        return new JsonResult<>(true,photoAlbumService.getByGoodsId(goods));
    }

    public static void main(String[] args) {
        System.out.println(0|0<<2|0<<5);
    }
}

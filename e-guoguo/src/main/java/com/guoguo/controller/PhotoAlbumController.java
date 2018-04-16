package com.guoguo.controller;

import com.guoguo.bean.PhotoAlbumDetail;
import com.guoguo.common.Constants;
import com.guoguo.common.UpdateGroups;
import com.guoguo.reqsVo.PhotoAlbumDetailAdd;
import com.guoguo.respVo.PhotoAlbumDetailResp;
import com.guoguo.respVo.PhotoAlbumUpdateVo;
import com.guoguo.respVo.JsonResult;
import com.guoguo.reqsVo.PhotoAlbumReqs;
import com.guoguo.service.PhotoAlbumDetailService;
import com.guoguo.service.PhotoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by lenovo on 2018/4/8.
 */
@Controller
@RequestMapping("photoAlbum")
public class PhotoAlbumController {

    @Autowired
    private PhotoAlbumService photoAlbumService;

    @Autowired
    private PhotoAlbumDetailService photoAlbumDetailService;

    @RequestMapping("grid/{goodsId}")
    public String grid(Model model,@PathVariable("goodsId") Integer goodsId){

        model.addAttribute("list",photoAlbumService.getList(goodsId));
        model.addAttribute("goodsId",goodsId);
        return "goods/photoAlbum";
    }


    @RequestMapping(value = "addAlbum",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult<Integer> addAlbum(@Valid @RequestBody PhotoAlbumUpdateVo vo,BindingResult bindingResult){

        if(bindingResult.hasErrors())
            return JsonResult.newError(Constants.REQUEST_ERROR_CODE,bindingResult.getFieldError().getDefaultMessage());

        return JsonResult.newSuccess(photoAlbumService.addAlbum(vo),"添加成功");
    }

    @RequestMapping(value = "updateAlbum",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult<Integer> updateAlbum(@Validated(UpdateGroups.class) @RequestBody PhotoAlbumUpdateVo vo,BindingResult bindingResult){

        if(bindingResult.hasErrors())
            return JsonResult.newError(Constants.REQUEST_ERROR_CODE,bindingResult.getFieldError().getDefaultMessage());

        return JsonResult.newSuccess(photoAlbumService.updateAlbum(vo),"修改成功");
    }

    @RequestMapping(value = "deleteAlbum/{id}",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult<Integer> deleteAlbum(@PathVariable("id") Integer id){
        if(null == id)
            return JsonResult.newError(Constants.ERROR_VALID_CODE,"参数有误");
        PhotoAlbumUpdateVo vo = new PhotoAlbumUpdateVo();
        vo.setId(id);
        vo.setIsDel(Constants.IS_DEL.YES);
        return JsonResult.newSuccess(photoAlbumService.updateAlbum(vo),"修改成功");
    }

    @RequestMapping(value = "addPhoto",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult<Integer> addPhoto(@Valid @RequestBody PhotoAlbumDetailAdd add,BindingResult bindingResult){

        if(bindingResult.hasErrors())
            return JsonResult.newError(Constants.REQUEST_ERROR_CODE,bindingResult.getFieldError().getDefaultMessage());

        return JsonResult.newSuccess(photoAlbumDetailService.addPhoto(add),"添加成功");
    }

    @RequestMapping(value = "getListByAlbumId/{albumId}",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult<List<PhotoAlbumDetailResp>> getListByAlbumId(@PathVariable("albumId") Integer albumId){

        return JsonResult.newSuccess(photoAlbumDetailService.getListByAlbumId(albumId),"查询成功");
    }

    @RequestMapping(value = "deletePhoto/{photoId}",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult deletePhoto(@PathVariable("photoId") Integer photoId){

        PhotoAlbumDetail detail = new PhotoAlbumDetail();
        detail.setId(photoId);
        detail.setIsDel(Constants.IS_DEL.YES);
        return JsonResult.newSuccess(photoAlbumDetailService.updatePhoto(detail),"删除成功");
    }

    @RequestMapping(value = "sortPhoto/{photoId}/{sort}",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult sortPhoto(@PathVariable("photoId") Integer photoId,@PathVariable("sort") Integer sort){

        PhotoAlbumDetail detail = new PhotoAlbumDetail();
        detail.setId(photoId);
        detail.setSort(sort);
        return JsonResult.newSuccess(photoAlbumDetailService.updatePhoto(detail),"排序成功");
    }

}

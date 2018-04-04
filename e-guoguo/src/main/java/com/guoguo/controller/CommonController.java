package com.guoguo.controller;

import com.guoguo.respVo.JsonResult;
import com.guoguo.respVo.NationCodeResp;
import com.guoguo.respVo.NationRegionResp;
import com.guoguo.service.NationCodeService;
import com.guoguo.service.NationRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lenovo on 2018/4/4.
 */
@Controller
@RequestMapping("common")
public class CommonController extends BaseController {

    @Autowired
    private NationCodeService nationCodeService;

    @Autowired
    private NationRegionService nationRegionService;


    /**
     * 获取国家列表
     * @return
     */
    @RequestMapping("getNation")
    @ResponseBody
    public JsonResult<List<NationCodeResp>> getNation(){
        List<NationCodeResp> list = nationCodeService.getNation();

        return JsonResult.newSuccess(list,"查询成功");
    }

    /**
     * 根据国家获取省份
     * @param nationCode
     * @return
     */
    @RequestMapping("getProvince/{nationCode}")
    @ResponseBody
    public JsonResult<List<NationRegionResp>> getProvince(@PathVariable("nationCode") String nationCode){

        List<NationRegionResp> list = nationRegionService.getProvince(nationCode);

        return JsonResult.newSuccess(list,"查询成功");
    }

    /**
     * 根据省份获取城市
     * @param parentCode
     * @return
     */
    @RequestMapping("getCity/{parentCode}")
    @ResponseBody
    public JsonResult<List<NationRegionResp>> getCity(@PathVariable("parentCode") String parentCode){

        List<NationRegionResp> list = nationRegionService.getCity(parentCode);

        return JsonResult.newSuccess(list,"查询成功");
    }
}

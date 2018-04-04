package com.guoguo.controller;

import com.guoguo.reqsVo.TestVo;
import com.guoguo.respVo.JsonResultPage;
import com.guoguo.respVo.Test;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/2/8.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testView(Model model){

        return "test/sss";
    }

    @RequestMapping(value = "/getTestData",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResultPage<List<Test>> getTestData(@RequestBody TestVo vo){

        JsonResultPage<List<Test>> resultPage = new JsonResultPage<>();
        List<Test> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Test t = new Test();
            t.setBmmc("名称"+i);
            t.setBmjb(i+1);
            t.setMs("MS"+i);
            t.setSjbm("Sjbm"+i);
            list.add(t);
        }

        resultPage.setTotal(100);
        resultPage.setRows(list);
        return resultPage;
    }
}

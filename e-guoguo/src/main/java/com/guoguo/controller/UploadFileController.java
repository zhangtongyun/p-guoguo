package com.guoguo.controller;

import com.guoguo.respVo.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by lenovo on 2018/2/24.
 */
@Controller
@RequestMapping("/uploadFile")
public class UploadFileController {

    @Value("${upload.url}")
    private String url;
    @Value("${upload.pan}")
    private String pan;

    private static Logger logger = LoggerFactory.getLogger(UploadFileController.class);

    @RequestMapping(value = "/uploadImg",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<String> uploadImg(MultipartFile file){

        JsonResult<String> result = new JsonResult<>();
        LocalDateTime localTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String name = localTime.format(formatter) + (int)Math.random()*100;
        String path = url
                + name + file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
        String picUrl = pan + path;
        File ff = new File(picUrl);
        try {
            file.transferTo(ff);
        } catch (IOException e) {
            logger.error("上传图片失败，name:{},错误信息：{}",file.getOriginalFilename(),e.getMessage());
            result.setOk(false);
            result.setResDescription("上传失败");
            return result;
        }
        result.setOk(true);
        result.setRows(path);
        result.setResDescription("查询成功");
        return result;
    }

}

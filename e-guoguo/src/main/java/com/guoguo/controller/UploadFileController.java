package com.guoguo.controller;

import com.guoguo.resVo.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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

    private static final String BASE_PATH = "D:/";
    private static Logger logger = LoggerFactory.getLogger(UploadFileController.class);

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "/uploadImg",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JsonResult<String> uploadImg(MultipartFile file){

        JsonResult<String> result = new JsonResult<>();
        LocalDateTime localTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String name = localTime.format(formatter) + (int)Math.random()*100;
        String path = BASE_PATH + "/upload/"
                + name + file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
        File ff = new File(path);
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

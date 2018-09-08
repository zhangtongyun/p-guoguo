package com.guoguo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lenovo on 2018/8/20.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    //本地调试使用
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //创建虚拟路径
        registry.addResourceHandler("/upload/**").addResourceLocations("file:D:/upload/");
        super.addResourceHandlers(registry);
    }

}


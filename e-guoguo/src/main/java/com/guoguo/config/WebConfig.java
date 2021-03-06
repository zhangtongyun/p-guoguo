package com.guoguo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.MultipartConfigElement;

/**
 * Created by lenovo on 2018/2/1.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Value("${upload.url}")
    private String imgPath;

    @Value("${upload.file}")
    private String file;

    @Value("${upload.pan}")
    private String pan;


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

//    //本地调试使用
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //创建虚拟路径
//        registry.addResourceHandler("/upload/**").addResourceLocations(file+pan+imgPath);
//        super.addResourceHandlers(registry);
//    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ErrorInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    /**
      * 文件上传临时路径
      */
      @Bean
      MultipartConfigElement multipartConfigElement() {
             MultipartConfigFactory factory = new MultipartConfigFactory();
             factory.setLocation(System.getProperty("user.dir")+"/upload/tmp");
             return factory.createMultipartConfig();
      }
}

package com.guoguo.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2018/7/9.
 */

@Component
@PropertySource(value = "system.properties",ignoreResourceNotFound = true)
public class SystemProperties implements InitializingBean {

    @Autowired
    private Environment environment;

    private static String url;

    private static String file;

    @Override
    public void afterPropertiesSet() throws Exception {
        url = environment.getProperty("upload.url");
        file = environment.getProperty("upload.file");
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        SystemProperties.url = url;
    }
}

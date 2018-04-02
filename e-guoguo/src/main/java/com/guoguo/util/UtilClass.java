package com.guoguo.util;

import org.apache.commons.lang.StringUtils;

/**
 * Created by lenovo on 2018/2/26.
 */
public class UtilClass {

    public static String getColumn(String st){
        if(StringUtils.isBlank(st))
            return st;

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < st.length(); i++){
            if(Character.isUpperCase(st.charAt(i))){
                sb.append("_");
            }
            sb.append(st.charAt(i));
        }

        return sb.toString();
    }
}

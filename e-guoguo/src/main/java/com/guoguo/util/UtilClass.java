package com.guoguo.util;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static <K,T> List<K> copyList(List<T> list,Class<K> k){
        if(CollectionUtils.isEmpty(list))
            return Collections.EMPTY_LIST;
        List<K> r = new ArrayList<>();
        list.forEach(t -> {
            K k1 = BeanUtils.instantiateClass(k);
            BeanUtils.copyProperties(t,k1);
            r.add(k1);
        });
        return r;
    }
}

package com.guoguo.util;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lenovo on 2018/4/23.
 */
public class Util {

    public static <T,K> List<K> copyList(List<T> list,Class<K> k){
        if(CollectionUtils.isEmpty(list))
            return Collections.EMPTY_LIST;
        List<K> ks = new ArrayList<>();
        list.forEach(t -> {
            K k1 = BeanUtils.instantiateClass(k);
            BeanUtils.copyProperties(t,k1);
            ks.add(k1);
        });
        return ks;
    }
}

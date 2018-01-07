package com.jojoldu.intellij.development.util;

import org.springframework.util.StringUtils;

/**
 * Created by jojoldu@gmail.com on 2018. 1. 7.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public abstract class NumberUtil {

    public static Long toLong(String s){
        if(StringUtils.isEmpty(s)){
            return 0L;
        }

        return Long.valueOf(s);
    }
}

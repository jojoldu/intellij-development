package com.jojoldu.intellij.development.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by jojoldu@gmail.com on 2018. 1. 6.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public abstract class LocalDateUtil {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static String toStringDate(LocalDate localDate){
        return formatter.format(localDate);
    }
}

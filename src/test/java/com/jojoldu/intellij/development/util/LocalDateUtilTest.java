package com.jojoldu.intellij.development.util;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 2018. 1. 6.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class LocalDateUtilTest {

    @Test
    public void LocalDate가_yyyyMMdd문자열로_전환된다() {
        //given
        LocalDate localDate = LocalDate.of(2018,1,6);

        //when
        String strDate = LocalDateUtil.toStringDate(localDate);

        //then
        assertThat(strDate).isEqualTo("20180106");

    }
}

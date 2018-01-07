package com.jojoldu.intellij.development.util;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 2018. 1. 7.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class NumberUtilTest {

    @Test
    public void 문자열이_들어오면_Long으로_반환한다 () {
        //given
        String numberString = "10";

        //when
        Long number = NumberUtil.toLong(numberString);

        //then
        assertThat(number).isEqualTo(number);
    }
}

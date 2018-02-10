package com.jojoldu.intellij.development.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 2018. 2. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class JsonTester {

    @Test
    public void JSON_쉽게만들기() throws IOException {
        //given
        String json = "{\"name\":\"a\", \"age\": \"28\"}";
        ObjectMapper mapper = new ObjectMapper();

        //when
        Map<String, String> jsonMap = mapper.readValue(json, Map.class);

        //then
        assertThat(jsonMap.get("name")).isEqualTo("a");
    }
}

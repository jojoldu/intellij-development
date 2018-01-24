package com.jojoldu.intellij.development.web.http;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jojoldu@gmail.com on 2018. 1. 24.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
public class CookieController {

    @GetMapping("/cookie/")
    public String getCookie(@CookieValue("") String fooCookie) {

    }
}

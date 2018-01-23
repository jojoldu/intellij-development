package com.jojoldu.intellij.development.web;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jojoldu@gmail.com on 2018. 1. 23.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
@AllArgsConstructor
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/dev/hello")
    public String devHello(HttpServletRequest request) {
        String auth = request.getHeader("Authorization");

        if(!"DEV".equals(auth)){
            throw new AccessDeniedException();
        }

        return "devHello";
    }

    @GetMapping("/real/hello")
    public String realHello(HttpServletRequest request) {
        String auth = request.getHeader("Authorization");

        if(!"PRODUCTION".equals(auth)){
            throw new AccessDeniedException();
        }

        return "productionHello";
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    static class AccessDeniedException extends RuntimeException {

    }


}

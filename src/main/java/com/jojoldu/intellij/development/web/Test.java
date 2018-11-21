package com.jojoldu.intellij.development.web;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2018. 2. 24.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("aaa");
    }

    public void print() {
        List<String> strs = Arrays.asList("apple", "banana", "orange");

        for (int i = 0; i < strs.size(); i++) {
            System.out.println(strs.get(i));
        }
    }

    public void show() {
        int a;
        int b;

        System.out.println("a");
    }
}

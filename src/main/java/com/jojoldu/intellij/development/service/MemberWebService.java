package com.jojoldu.intellij.development.service;

import com.jojoldu.intellij.development.domain.Member;
import com.jojoldu.intellij.development.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by jojoldu@gmail.com on 2018. 11. 22.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberWebService {
    private final MemberRepository memberRepository;

    public void addWeb() {
        Member member = new Member("name", "email");
        System.out.println("member=");
    }
}

package com.jojoldu.intellij.development.web.member;

import com.jojoldu.intellij.development.domain.Member;
import com.jojoldu.intellij.development.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2018. 2. 9.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@Slf4j
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/members")
    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    @GetMapping("/member/{id}")
    public Member findOne(@PathVariable("id") Long id) {
        return memberRepository.findOne(id);
    }
}


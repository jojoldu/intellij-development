package com.jojoldu.intellij.development.web.member;

import com.jojoldu.intellij.development.domain.Member;
import com.jojoldu.intellij.development.domain.MemberRepository;
import com.jojoldu.intellij.development.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2018. 11. 22.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@Slf4j
@RequiredArgsConstructor
@RestController
public class MemberWebController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @GetMapping("/members")
    public List<Member> findAll(){
        List<Member> members = memberRepository.findAll();

        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }

        return members;
    }

    @GetMapping("/member/{id}")
    public Member findOne(@PathVariable("id") Long id) {
        String name = "name";
        return memberRepository.findOne(id);
    }
}


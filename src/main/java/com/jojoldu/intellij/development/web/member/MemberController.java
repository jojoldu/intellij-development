package com.jojoldu.intellij.development.web.member;

import com.jojoldu.intellij.development.domain.Member;
import com.jojoldu.intellij.development.domain.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2018. 2. 9.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
@AllArgsConstructor
public class MemberController {

    private MemberRepository memberRepository;

    @GetMapping("/members")
    public List<Member> findAll(){
        return memberRepository.findAll();
    }
}

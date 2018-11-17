package com.jojoldu.intellij.development.web.member;

import com.jojoldu.intellij.development.domain.Member;
import com.jojoldu.intellij.development.domain.MemberRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by jojoldu@gmail.com on 2018. 11. 17.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MemberControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MemberRepository memberRepository;

    @After
    public void tearDown() throws Exception {
        memberRepository.deleteAllInBatch();
    }

    @Test
    public void PathVariable로_id로_조회된다() throws Exception {
        //given
        memberRepository.save(new Member("jojoldu", "jojoldu@gmail.com"));
        Long id = 1L;

        //when
        ResultActions perform = this.mockMvc.perform(get("/member/" + id));

        //then
        perform.andExpect(status().isOk())
                .andExpect(content().string("{\"id\":1,\"name\":\"jojoldu\",\"email\":\"jojoldu@gmail.com\"}"));

    }
}

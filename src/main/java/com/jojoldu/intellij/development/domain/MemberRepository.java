package com.jojoldu.intellij.development.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jojoldu@gmail.com on 2018. 2. 9.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public interface MemberRepository extends JpaRepository<Member, Long> {
}

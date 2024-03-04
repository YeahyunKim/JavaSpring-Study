package hello.hellospring.service;

import hello.hellospring.domain.Member;
//import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("Hello");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void findMember() {
    }

    @Test
    void findOne() {
    }
}
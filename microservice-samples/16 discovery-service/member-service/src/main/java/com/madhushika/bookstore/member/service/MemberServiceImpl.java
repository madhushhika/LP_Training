package com.madhushika.bookstore.member.service;
import com.madhushika.bookstore.commons.model.member.Member;
import com.madhushika.bookstore.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;


    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }


    @Override
    public Member findById(int id) {
        Optional<Member> member = memberRepository.findById(id);

        if (member.isPresent())
            return member.get();
        else
            return new Member();

    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

}

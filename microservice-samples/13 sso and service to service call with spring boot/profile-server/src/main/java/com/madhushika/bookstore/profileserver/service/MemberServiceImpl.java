package com.madhushika.bookstore.profileserver.service;

import com.madhushika.bookstore.commons.model.Member;
import com.madhushika.bookstore.profileserver.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository customerRepository;

    @Override
    public Member save(Member customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Member fetchById(int profileId) {
        Optional<Member> member = customerRepository.findById(profileId);
        if (member.isPresent()) {
            return member.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Member> fetchAllProfiles() {
        return customerRepository.findAll();
    }
}
package com.madhushika.bookstore.profileserver.service;

import com.madhushika.bookstore.commons.model.Member;
import com.madhushika.bookstore.profileserver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository memberRepository;

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

}

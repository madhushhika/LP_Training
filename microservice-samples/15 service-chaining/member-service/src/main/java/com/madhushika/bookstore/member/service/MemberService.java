package com.madhushika.bookstore.member.service;

import com.madhushika.bookstore.commons.model.member.Member;


import java.util.List;

public interface MemberService {


    Member save(Member member);

    Member findById(int id);

    List<Member> findAll();


}
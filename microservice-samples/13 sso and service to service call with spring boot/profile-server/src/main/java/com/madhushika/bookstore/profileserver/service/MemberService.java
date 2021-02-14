package com.madhushika.bookstore.profileserver.service;

import com.madhushika.bookstore.commons.model.Member;

import java.util.List;

public interface MemberService {

    Member fetchById(int profileId);
    List<Member> fetchAllProfiles();
    Member save(Member member);
}
package com.madhushika.bookstore.member.repository;
import com.madhushika.bookstore.commons.model.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member,Integer> {


}

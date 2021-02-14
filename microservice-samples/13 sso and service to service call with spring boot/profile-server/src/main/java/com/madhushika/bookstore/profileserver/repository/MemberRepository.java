package com.madhushika.bookstore.profileserver.repository;
import com.madhushika.bookstore.commons.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member,Integer> {


}

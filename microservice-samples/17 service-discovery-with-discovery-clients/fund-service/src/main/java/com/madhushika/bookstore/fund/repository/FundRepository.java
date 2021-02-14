package com.madhushika.bookstore.fund.repository;
import com.madhushika.bookstore.commons.model.fund.Fund;
import com.madhushika.bookstore.commons.model.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FundRepository extends JpaRepository<Fund,Integer> {


}

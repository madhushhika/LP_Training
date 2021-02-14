package com.madhushika.bookstore.fund.service;

import com.madhushika.bookstore.commons.model.fund.Fund;
import com.madhushika.bookstore.commons.model.member.Member;

import java.util.List;

public interface FundService {


    List<Fund> findAll();

    Fund findById(int id);

    Fund save(Fund fund);
}
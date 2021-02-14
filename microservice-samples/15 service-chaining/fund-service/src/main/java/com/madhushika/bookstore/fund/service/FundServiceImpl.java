package com.madhushika.bookstore.fund.service;

import com.madhushika.bookstore.commons.model.fund.Fund;
import com.madhushika.bookstore.fund.repository.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FundServiceImpl implements FundService {
    @Autowired
    FundRepository fundRepository;


    @Override
    public Fund save(Fund fund) {

        return fundRepository.save(fund);
    }


    @Override
    public Fund findById(int id) {
        Optional<Fund> funds = fundRepository.findById(id);

        if (funds.isPresent())
            return funds.get();
        else
            return new Fund();

    }

    @Override
    public List<Fund> findAll() {
        return fundRepository.findAll();
    }
}
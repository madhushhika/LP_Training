package com.madhushika.bookstore.fund.controller;
import com.madhushika.bookstore.commons.model.fund.Fund;
import com.madhushika.bookstore.commons.model.member.Member;
import com.madhushika.bookstore.fund.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/funds")
public class FundController {

    @Autowired
    FundService fundService;

    @PostMapping
    public Fund save(@RequestBody Fund fund) {
        return fundService.save(fund);
    }

    @GetMapping(value = "/{id}")
    public Fund getFunds(@PathVariable int id) {
        System.out.println("request came on " + LocalDateTime.now() + "  ++++++++++++++++++++++");
        return fundService.findById(id);
    }

    @GetMapping
    public List<Fund> getAllFunds() {
        return fundService.findAll();
    }
}

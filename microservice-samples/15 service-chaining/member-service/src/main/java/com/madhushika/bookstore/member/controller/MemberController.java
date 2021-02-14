package com.madhushika.bookstore.member.controller;
import com.madhushika.bookstore.commons.model.member.Member;
import com.madhushika.bookstore.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/members")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping
    public Member save(@RequestBody Member member) {

        return memberService.save(member);
    }

    @GetMapping(value = "/{id}")
    public Member getCustomer(@PathVariable int id) {

        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return memberService.findById(id);
    }
   @GetMapping
  public List<Member> getAllMembers() { return memberService.findAll();
    }
}

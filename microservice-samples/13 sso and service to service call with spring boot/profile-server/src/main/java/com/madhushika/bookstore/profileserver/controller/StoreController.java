package com.madhushika.bookstore.profileserver.controller;
import com.madhushika.bookstore.commons.model.Member;
import com.madhushika.bookstore.profileserver.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/services")
public class StoreController {
    @Autowired
    MemberService memberService;


    @RequestMapping(value = "/members", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Member save(@RequestBody Member customer) {
        return memberService.save(customer);
    }

    @RequestMapping(value = "/members/{id}", method = RequestMethod.GET)
    public Member fetch(@PathVariable(value = "id") int memberid) {
        return memberService.fetchById(memberid);
    }

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_admin')")  //ROLE_operator
    public List<Member> fetch() {
        return memberService.fetchAllProfiles();
    }
}

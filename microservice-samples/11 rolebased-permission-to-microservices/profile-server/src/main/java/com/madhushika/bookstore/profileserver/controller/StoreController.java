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

   /* @RequestMapping(value = "/profile",method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Member save(@RequestBody Member member) {
        return memberService.save(member);
    }*/
   @RequestMapping(value = "/profile", method = RequestMethod.POST)
   public Member save(@RequestBody Member customer) {
       return memberService.save(customer);
   }
      @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public Member fetch(@RequestParam int profileId) {

          return memberService.fetchById(profileId);
    }
    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    public List<Member> fetch() {
        return memberService.fetchAllProfiles();
    }

/*
    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    @PreAuthorize("hasAnyAuthority()('ROLE_operator')")
    public List<Member> fetch() {
        return memberService.fetchAllProfiles();
    } */
}

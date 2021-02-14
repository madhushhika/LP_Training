package com.madhushika.bookstore.profileserver.controller;

import com.madhushika.bookstore.commons.model.Member;
import com.madhushika.bookstore.profileserver.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/services")
public class StoreController {
    @Autowired
    CustomerService memberService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String greetingPost() {
        return "Hello world I am from Post!";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Member save(@RequestBody Member member) {

        return memberService.save(member);
    }
    /*
      @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public Customer fetch(@RequestParam int profileId) {
        return customerService.fetchById(profileId);
    }

    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    public List<Customer> fetch() {
        return customerService.fetchAllProfiles();
    }
     */
}

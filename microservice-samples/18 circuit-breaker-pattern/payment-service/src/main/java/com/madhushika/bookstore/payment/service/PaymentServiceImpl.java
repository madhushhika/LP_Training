package com.madhushika.bookstore.payment.service;


import com.madhushika.bookstore.commons.model.fund.Fund;
import com.madhushika.bookstore.commons.model.member.Member;
import com.madhushika.bookstore.commons.model.payment.Payment;
import com.madhushika.bookstore.payment.hystrix.CommonHystrixCommand;
import com.madhushika.bookstore.payment.hystrix.FundCommand;
import com.madhushika.bookstore.payment.model.DetailResponse;
import com.madhushika.bookstore.payment.repository.PaymentRepository;
import com.netflix.hystrix.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    HystrixCommand.Setter setter;
    @Autowired
    PaymentRepository paymentRepository;

    @LoadBalanced //wecan use @RibbonClient
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;


    @Override
    public Payment save(Payment member) {
        return paymentRepository.save(member);
    }


    @Override
    public Payment findById(int id) {
        Optional<Payment> payment = paymentRepository.findById(id);

        if (payment.isPresent())
            return payment.get();
        else
            return new Payment();

    }

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    /*   @Override
       @HystrixCommand(fallbackMethod = "findDetailResponseFallback")
       public DetailResponse findDetailResponse(int id) {

           Payment payment = findById(id);

           //  //first methods need to to controller
           Member member = restTemplate.getForObject("http://member/services/members/" + id, Member.class);
           Fund fund = getFund(payment.getFundId());
           // Member member = getMemberId(payment.getMemberId());

           return new DetailResponse(member, payment, fund);


       } */
    @Override
    public DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException {

        Payment payment = findById(id);
        Member member = getMemberId(payment.getMemberId());
        Fund fund = getFund(payment.getFundId());

        return new DetailResponse(member, payment, fund);
    }

   /* public DetailResponse findDetailResponseFallback(int id) {
        return new DetailResponse(new Member(), new Payment(), new Fund());
    }
    */

    private Member getMemberId(int memeberId) throws ExecutionException, InterruptedException {
        CommonHystrixCommand<Member> commonHystrixCmd = new CommonHystrixCommand<Member>(setter, () -> {
            return restTemplate.getForObject("http://member/services/members/" + memeberId, Member.class);
        }, () -> {
            return new Member();
        });
        Future<Member> memberFuture = commonHystrixCmd.queue();
        return memberFuture.get();
        //  Member member = restTemplate.getForObject("http://member/services/members/" + memeberId, Member.class);
        //  return member;

    }

    private Fund getFund(int fundId) {
        FundCommand fundCommand = new FundCommand(restTemplate, fundId);
        return fundCommand.execute();
        //  return restTemplate.getForObject("http://fund/services/funds/" + fundId, Fund.class);

    }


}
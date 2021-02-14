package com.madhushika.bookstore.payment.hystrix;

import com.madhushika.bookstore.commons.model.fund.Fund;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

public class FundCommand extends HystrixCommand<Fund> {

    RestTemplate restTemplate;
    int fundId;

    public FundCommand(RestTemplate restTemplate, int fundId) {
        super(HystrixCommandGroupKey.Factory.asKey("default"));
    this.restTemplate =restTemplate;
    this.fundId =fundId;
    }



    @Override
    public Fund run() throws Exception {
        return restTemplate.getForObject("http://fund/services/funds/" + fundId, Fund.class);

    }
    @Override
    protected Fund getFallback() {
        System.out.println("-----from fallback-------");
        return new Fund();
    }
}

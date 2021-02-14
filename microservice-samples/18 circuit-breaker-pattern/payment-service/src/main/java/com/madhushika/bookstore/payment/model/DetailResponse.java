package com.madhushika.bookstore.payment.model;

import com.madhushika.bookstore.commons.model.fund.Fund;
import com.madhushika.bookstore.commons.model.member.Member;
import com.madhushika.bookstore.commons.model.payment.Payment;

public class DetailResponse implements Response {
    Member member;
    Payment payment;
    Fund fund;
    public DetailResponse(Member member, Payment payment, Fund fund) {
        this.fund = fund;
        this.member = member;
        this.payment = payment;
    }


    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Fund getFund() {
        return fund;
    }

    public void setFund(Fund fund) {
        this.fund = fund;
    }


}

package com.madhushika.bookstore.payment.model;

import com.madhushika.bookstore.commons.model.payment.Payment;

public class SimpleResponse implements Response {
    Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public SimpleResponse(Payment payment) {
        this.payment = payment;
    }


}

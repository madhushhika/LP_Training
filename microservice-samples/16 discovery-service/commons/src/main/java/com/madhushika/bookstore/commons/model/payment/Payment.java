package com.madhushika.bookstore.commons.model.payment;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "payment")
@Data

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int paymentId;
    int memberId;
    int fundId;
    String paymentMethod;
    String paymentService;

}

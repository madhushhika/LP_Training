package com.madhushika.bookstore.commons.model.fund;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "fund")
@Data
public class Fund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String communityName;
    String communityCode;
}
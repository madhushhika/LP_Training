package com.madhushika.bookstore.commons.model.member;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "member")
@Data
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String LastName;
    String City;
    String PostCode;
    @OneToMany(mappedBy = "member")
    private List<Loyality> loyalities;
}

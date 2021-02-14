package com.madhushika.bookstore.commons.model;

import javax.persistence.*;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String LastName;
    String City;
    String PostCode;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
}

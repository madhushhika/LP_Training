package com.madhushika.bookstore.commons.model.Book;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String typeMember;
    String publishedYear;


}

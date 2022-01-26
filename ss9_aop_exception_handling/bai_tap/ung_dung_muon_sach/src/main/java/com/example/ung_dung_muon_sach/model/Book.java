package com.example.ung_dung_muon_sach.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long quantity;
    private String author;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<DetailBook> detailBooks;


    public Book() {
    }

    public Book(String name, long quantity, String author, Set<DetailBook> detailBooks) {
        this.name = name;
        this.quantity = quantity;
        this.author = author;
        this.detailBooks = detailBooks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<DetailBook> getDetailBooks() {
        return detailBooks;
    }

    public void setDetailBooks(Set<DetailBook> detailBooks) {
        this.detailBooks = detailBooks;
    }
}

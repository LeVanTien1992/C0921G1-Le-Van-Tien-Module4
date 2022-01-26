package com.example.ung_dung_muon_sach.model;

import javax.persistence.*;

@Entity
public class DetailBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int code;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false, referencedColumnName = "id")
    private Book book;

    public DetailBook() {
    }

    public DetailBook(int code, Book book) {
        this.code = code;
        this.book = book;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


}

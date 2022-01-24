package com.example.ung_dung_muon_sach.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookId;
    private String name;
    private Long quantity;
    private String author;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<DetailBook> detailBook;

    public Book(String bookId, String name, Long quantity, String author, Set<DetailBook> detailBook) {
        this.bookId = bookId;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
        this.detailBook = detailBook;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<DetailBook> getDetailBook() {
        return detailBook;
    }

    public void setDetailBook(Set<DetailBook> detailBook) {
        this.detailBook = detailBook;
    }
}

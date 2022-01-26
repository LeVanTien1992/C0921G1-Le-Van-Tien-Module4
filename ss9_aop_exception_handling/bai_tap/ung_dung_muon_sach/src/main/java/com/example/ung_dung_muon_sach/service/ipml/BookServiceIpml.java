package com.example.ung_dung_muon_sach.service.ipml;

import com.example.ung_dung_muon_sach.model.Book;
import com.example.ung_dung_muon_sach.model.DetailBook;
import com.example.ung_dung_muon_sach.repository.BookRepository;
import com.example.ung_dung_muon_sach.service.BookService;
import com.example.ung_dung_muon_sach.service.DetailBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookServiceIpml implements BookService {


    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private DetailBookService detailBookService;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);

        for (int i = 0; i < book.getQuantity(); i++) {
            int n = 10000 * new Random().nextInt(90000);
            DetailBook detailBook = new DetailBook(n,bookRepository.findById(book.getId()).orElse(null));
            detailBookService.save(detailBook);
        }
    }
}

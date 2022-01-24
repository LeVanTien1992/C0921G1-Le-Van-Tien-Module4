package com.example.ung_dung_muon_sach.service.ipml;

import com.example.ung_dung_muon_sach.model.DetailBook;
import com.example.ung_dung_muon_sach.repository.DetailBookRepository;
import com.example.ung_dung_muon_sach.service.DetailBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailBookServiceIpml implements DetailBookService {

    @Autowired
    private DetailBookRepository detailBookRepository;

    @Override
    public List<DetailBook> findAll() {
        return detailBookRepository.findAll();
    }
}

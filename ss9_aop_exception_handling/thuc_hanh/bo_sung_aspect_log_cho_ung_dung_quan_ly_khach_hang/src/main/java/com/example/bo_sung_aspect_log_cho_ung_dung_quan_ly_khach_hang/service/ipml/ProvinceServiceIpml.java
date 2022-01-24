package com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.service.ipml;

import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.model.Province;
import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.repository.ProvinceRepository;
import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceServiceIpml implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAll() {
        return null;
    }
}

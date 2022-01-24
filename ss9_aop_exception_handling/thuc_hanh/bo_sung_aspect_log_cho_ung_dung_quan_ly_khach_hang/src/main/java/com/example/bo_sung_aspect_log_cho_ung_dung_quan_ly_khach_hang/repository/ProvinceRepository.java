package com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.repository;

import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {
}

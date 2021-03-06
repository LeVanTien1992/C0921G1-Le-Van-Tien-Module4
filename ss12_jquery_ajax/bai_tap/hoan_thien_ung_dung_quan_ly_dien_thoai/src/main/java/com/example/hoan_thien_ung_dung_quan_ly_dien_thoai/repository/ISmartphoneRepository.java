package com.example.hoan_thien_ung_dung_quan_ly_dien_thoai.repository;

import com.example.hoan_thien_ung_dung_quan_ly_dien_thoai.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}

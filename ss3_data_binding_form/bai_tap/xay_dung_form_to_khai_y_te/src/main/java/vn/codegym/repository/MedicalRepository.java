package vn.codegym.repository;

import vn.codegym.model.Medical;

import java.util.List;

public interface MedicalRepository {
    List<Medical> findAll();
    void save(Medical medical);
    Medical getById(int index);
}

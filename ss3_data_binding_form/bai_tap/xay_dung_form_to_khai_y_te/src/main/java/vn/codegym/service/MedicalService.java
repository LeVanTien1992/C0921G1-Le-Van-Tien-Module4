package vn.codegym.service;

import vn.codegym.model.Medical;

import java.util.List;

public interface MedicalService {
    List<Medical> findAll();
    void save(Medical medical);
    Medical getById(int index);
}

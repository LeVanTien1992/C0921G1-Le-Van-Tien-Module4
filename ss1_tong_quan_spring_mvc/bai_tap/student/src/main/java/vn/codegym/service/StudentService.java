package vn.codegym.service;

import vn.codegym.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void remove(String id);
    Student getById(int id);
    void updateById(int id,Student student);
    void add(Student student);
}

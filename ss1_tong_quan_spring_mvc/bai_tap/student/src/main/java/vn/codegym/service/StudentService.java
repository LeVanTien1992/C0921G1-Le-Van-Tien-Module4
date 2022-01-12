package vn.codegym.service;

import vn.codegym.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void remove(String id);
    Student getById(String id);
    void updateById(Student student);
    void add(Student student);
}

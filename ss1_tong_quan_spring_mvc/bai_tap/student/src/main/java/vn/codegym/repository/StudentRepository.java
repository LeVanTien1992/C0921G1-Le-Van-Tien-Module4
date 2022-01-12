package vn.codegym.repository;

import vn.codegym.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    void remove(String id);
    Student getById(String id);
    void updateById(Student student);
    void add(Student student);
}

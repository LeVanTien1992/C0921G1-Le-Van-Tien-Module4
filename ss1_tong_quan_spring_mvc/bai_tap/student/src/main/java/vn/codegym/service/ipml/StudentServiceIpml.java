package vn.codegym.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Student;
import vn.codegym.repository.StudentRepository;
import vn.codegym.repository.ipml.StudentRepositoryIpml;
import vn.codegym.service.StudentService;

import java.util.List;
@Service
public class StudentServiceIpml implements StudentService {
    @Autowired
    private StudentRepository studentRepository ;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void remove(String id) {
        studentRepository.remove(id);
    }

    public Student getById(String id) {
        return null;
    }

    public void updateById(Student student) {

    }

    public void add(Student student) {

    }
}

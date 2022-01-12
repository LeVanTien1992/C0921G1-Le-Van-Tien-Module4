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

    public Student getById(int id) {
        return studentRepository.getById(id);
    }

    public void updateById(int id,Student student) {
        studentRepository.updateById(id, student);
    }

    public void add(Student student) {
        studentRepository.add(student);
    }
}

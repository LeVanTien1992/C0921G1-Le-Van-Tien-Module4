package vn.codegym.repository.ipml;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Student;
import vn.codegym.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepositoryIpml implements StudentRepository {
    private static List<Student> studentList;
    static {
        studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "Tiến", "10", "1 Nguyen Van Linh", "0903240343"));
        studentList.add(new Student(2, "BÌNH", "20", "2 Nguyen Van Linh", "0903240353"));
        studentList.add(new Student(3, "TRang", "20", "3 Nguyen Van Linh", "0903230343"));
        studentList.add(new Student(4, "Vinh", "10", "4 Nguyen Van Linh", "0903248343"));
    }
    public List<Student> findAll() {
        return new ArrayList<Student>(studentList);
    }

    public void remove(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if(id.equals(studentList.get(i).getId())){
                studentList.remove(studentList.get(i));
            }

        }
    }

    public Student getById(int id) {
        for (Student student: studentList){
            if(id == student.getId()){
                return student;
            }
        }
        return null;
    }

    public void updateById(int id,Student student) {
        studentList.add(id, student);
    }

    public void add(Student student) {
        studentList.add(student);
    }
}

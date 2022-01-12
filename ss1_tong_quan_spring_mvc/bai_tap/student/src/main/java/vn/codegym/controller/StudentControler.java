package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.model.Student;
import vn.codegym.service.StudentService;

import java.util.List;

@Controller
public class StudentControler {
    @Autowired
    private StudentService studentService ;

    @GetMapping(value = "/")
    public String hello(Model model){
        List<Student> studentList = studentService.findAll();
        model.addAttribute("stList", studentList);
        return "list";
    }

    @GetMapping(value = "/student/{id}")
    public String delete(
            @PathVariable String id){
        studentService.remove(id);
        return "redirect:/";
    }


    @GetMapping(value = "/add")
    public String formAdd(){
        return "create";
    }

    @PostMapping(value = "/student")
    public String addStudent(@RequestParam int id,
                             @RequestParam String name,
                             @RequestParam String age,
                             @RequestParam String address,
                             @RequestParam String phone){
        Student student = new Student(id, name, age, address, phone);
        studentService.add(student);
        return "redirect:/";
    }

    @GetMapping(value = "/show/{id}")
    public String showStudentById(
            @PathVariable(value = "id") int updateById, Model model){
        Student student = studentService.getById(updateById);
        model.addAttribute("student", student);
        return "update";
    }

    @PostMapping(value = "/update")
    public String update(@RequestParam int id,
                         @RequestParam String name,
                         @RequestParam String age,
                         @RequestParam String address,
                         @RequestParam String phone){
        Student student = new Student(id, name, age, address, phone);
        studentService.updateById( id, student);
        return "redirect:/";
    }
}

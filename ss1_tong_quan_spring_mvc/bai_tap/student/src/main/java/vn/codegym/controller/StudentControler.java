package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
            @RequestParam String id){
        studentService.remove(id);
        return "redirect:/";
    }
}

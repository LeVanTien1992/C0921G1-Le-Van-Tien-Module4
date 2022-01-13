package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Medical;
import vn.codegym.service.MedicalService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MedicalController {
    @Autowired
    private MedicalService medicalService;

    @GetMapping(value = "/")
    public String displayMedical(Model model){
        List<Medical> medicalList = medicalService.findAll();
        model.addAttribute("mList", medicalList);
        return "list";
    }

    @GetMapping(value = "/create")
    public String showFormCreate(Model model){
        List<String> year = new ArrayList<>();
        year.add("1985");
        year.add("1986");
        year.add("1987");
        year.add("1988");
        year.add("1989");
        year.add("1990");
        year.add("1991");
        year.add("1992");
        year.add("1993");
        year.add("1993");

        List<String> nationality = new ArrayList<>();
        nationality.add("Việt Nam");
        nationality.add("USA");
        nationality.add("Thái Lan");
        nationality.add("Japan");
        nationality.add("Combodia");
        nationality.add("Canada");
        nationality.add("Australia");
        nationality.add("Singapore");
        Medical medical = new Medical();
        model.addAttribute("medical", medical);
        model.addAttribute("yearList", year);
        model.addAttribute("nationalityList",nationality);
        return "create";
    }

    @PostMapping(value = "/createMedical")
    public String createMedical(@ModelAttribute Medical medical){
        medicalService.save(medical);
        return "redirect:/";
    }
}

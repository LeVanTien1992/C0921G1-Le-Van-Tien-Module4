package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.MailBox;
import vn.codegym.service.MaiBoxService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContentController {
    @Autowired
    private MaiBoxService maiBoxService;

    @GetMapping(value = "/")
    public String display(Model model){
        List<MailBox> mailBoxList = maiBoxService.findAll();
        model.addAttribute("mList", mailBoxList);
        return "list";
    }

    @GetMapping(value = "/create")
    public String formCreate(Model model){
        List<String> langugueList = new ArrayList<>();
        langugueList.add("English");
        langugueList.add("Vietnamese");
        langugueList.add("Japanese");
        langugueList.add("Chinese");

        List<Integer> pageSizeList = new ArrayList<>();
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);

        MailBox mailBox = new MailBox();
        model.addAttribute("mailBox", mailBox);
        model.addAttribute("langugueList", langugueList);
        model.addAttribute("pageList", pageSizeList);
        return "create";
    }

    @PostMapping(value = "/createMailBox")
    public String createMailBox(@ModelAttribute MailBox mailBox){
            maiBoxService.save(mailBox);
        return "redirect:/";
    }

    @GetMapping(value = "/mail/{pageSize}")
    public String findById(@PathVariable int pageSize, Model model){
        MailBox mailBox = maiBoxService.updateByPage(pageSize);
        model.addAttribute("mailBox", mailBox);
        List<String> langugueList = new ArrayList<>();
        langugueList.add("English");
        langugueList.add("Vietnamese");
        langugueList.add("Japanese");
        langugueList.add("Chinese");

        List<Integer> pageSizeList = new ArrayList<>();
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);
        model.addAttribute("langugueList", langugueList);
        model.addAttribute("pageList", pageSizeList);
        return "update";
    }


    @PostMapping(value = "/updateMailBox")
    public String updateMailBox(@ModelAttribute MailBox mailBox){
        maiBoxService.save(mailBox);
        return "redirect:/";
    }
}

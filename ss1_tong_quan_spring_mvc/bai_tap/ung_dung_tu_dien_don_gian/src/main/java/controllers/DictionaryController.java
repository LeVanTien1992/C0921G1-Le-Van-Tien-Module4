package controllers;

import bean.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;
import service.ipml.DictionaryServiceIpml;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DictionaryController {
    private static DictionaryService dictionaryService = new DictionaryServiceIpml();
    @GetMapping(value = "/search")
    public String search(){
        return "index";
    }
    @PostMapping(value = "/result")
    public String mean(@RequestParam String keyword, Model model){
        List<Dictionary> dictionaryList = this.dictionaryService.fillAll();
        for (int i = 0; i < dictionaryList.size(); i++) {
            if(keyword.equalsIgnoreCase(dictionaryList.get(i).getEn())){
                model.addAttribute("word", dictionaryList.get(i).getVi());
                model.addAttribute("key", keyword);
                return "result";
            }
        }
        return "result";
    }
}

package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CurrencyController {
    @GetMapping(value = "/currency")
    public String currency(){
        return "currency";
    }
    @PostMapping(value = "/result")
    public String result(String rate, String usd, Model model){
        double result = Double.parseDouble(rate) * Double.parseDouble(usd);
        model.addAttribute("result", result);
        return "result";
    }
}

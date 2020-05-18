package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/page1")
    public String homePage(Model model) {
        model.addAttribute("myvar", "Social distancing.");
        model.addAttribute("myvar2", "Missing family reunion.");
        return "page1";
    }
    @RequestMapping("/page2")
    public String loadPage2(){
        return "page2";
    }
}

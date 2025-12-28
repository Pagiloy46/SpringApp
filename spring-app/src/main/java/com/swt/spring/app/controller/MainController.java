package com.swt.spring.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, my first Spring controller!";
    }
    @GetMapping("/greeting")
    public String greeting(String Yaroslav, org.springframework.ui.Model model) {
        model.addAttribute("name", Yaroslav);
        return "greeting";
    }

}

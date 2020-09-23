package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String merhaba(Model model)
    {
        String messageContent ="Hello World1";
        model.addAttribute("message", messageContent);

        return "hello";
    }
}

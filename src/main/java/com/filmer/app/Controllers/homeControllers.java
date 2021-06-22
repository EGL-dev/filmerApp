package com.filmer.app.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeControllers {

    @GetMapping("")
    public String home(){
        return "home";
    }
}

package com.example.ks_demo.home;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {




    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/home")
    @ResponseBody

    public String homeAction(Model model){
         System.out.println("test test");
        return "index";

    }
}
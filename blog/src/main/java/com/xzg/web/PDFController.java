package com.xzg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PDFController {
    @GetMapping("/demo")
    public String List(){
        return "demo";
    }
}

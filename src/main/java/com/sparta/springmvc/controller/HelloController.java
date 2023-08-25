package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        // Where view is chosen and sent
        return "Hello fucker!!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "Requesting Get";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "Requesting Post";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "Requesting Put";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "Requesting Delete";
    }
}

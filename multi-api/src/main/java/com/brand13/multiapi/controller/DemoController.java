package com.brand13.multiapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.brand13.multiapi.service.DemoService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequiredArgsConstructor
public class DemoController {
    
    private final DemoService demoService;

    @GetMapping("/save")
    public String save() {
        return demoService.save();
    }
       
    @GetMapping("/find")
    public String find() {
        return demoService.find();
    }
    
    @GetMapping("/exception")
    public String exception() {
        return demoService.exception();
    }
    
}

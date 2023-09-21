package com.example.springdeployonwildfly.endpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class Hello {


    @GetMapping("/")
    public String hello(){
        System.out.println("Chamando método## hello");
        return "hello world";
    }
}

package com.example.spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/hello/{name}")
public String msg(@PathVariable String name){
    return "Welcome to Path Variable."+name;
}
@RequestMapping("/check_age/{age}")
public String checkAge(@PathVariable int age){
        if (age>18){
            return "You are eligible for voting";
        }
        else{
            return "you are not eligible for voting";
        }
}
@RequestMapping("/your_salary/{salary}")
public String checkSalary(@PathVariable double salary){

        if (salary>90000.00){
            return "your salary is good.";
        }
        else{
            return "Your salary is average";
        }
}
}

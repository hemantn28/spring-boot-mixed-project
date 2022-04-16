package com.example.spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MixedController {

    @RequestMapping("/write")
    public String makeStatement(){
        return "Hey, Where are you going?";
    }

    @RequestMapping("/replyback")
    public String reply(){
        return "Hey! I am going to nowhere.";
    }

    @RequestMapping("/num")
    public int number(){
        return 4587;
    }

    @RequestMapping("/yoursalary")
    public double salary(){
        return 6500000.00;
    }


    @RequestMapping("/addition")
    public int add(){
        int a=45;
        int b=58;
        int c=a+b;
        return c;
    }

    @RequestMapping("/addify")
    public String sum(){
        int a=85;
        int b=76;
        int c=a+b;
        return "Addition is: "+c;
    }

    @RequestMapping("/subtraction")
    public int minus(){
        int a=93;
        int b=69;
        int c=a-b;
        return c;
    }

    @RequestMapping("/minus")
    public String subtract(){
        int a=36;
        int b=18;
        int c=a-b;
        return "Subtraction is: "+c;
    }

    @RequestMapping("/division")
    public String divide(){
        int a=80;
        int b=20;
        int c=a/b;
        return "division is: "+c;
    }
    @RequestMapping("/divide")
    public float division(){
        float a=78.0f;
        float b=5.0f;
        float c=a/b;
        return c;
    }

    @RequestMapping("/multiplication")
    public float multiply(){
        float a=1.5f;
        float b=1.5f;
        float c=a*b;
        return c;
    }

    @RequestMapping("/multiply")
    public String into(){
        int a=5;
        int b=4;
        int c=a*b;
        return "multiplication is: "+c;
    }

    @RequestMapping("/into/{a}/{b}")
    public String multiply2(@PathVariable float a, @PathVariable float b){
        return "multiplication is: "+(a*b);

    }
}

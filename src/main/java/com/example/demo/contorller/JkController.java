package com.example.demo.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jk")
public class JkController {

    @RequestMapping("/Hello")
    public String getInfo(){
        return "hello";
    }

}

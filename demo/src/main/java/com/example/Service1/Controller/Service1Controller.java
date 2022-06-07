package com.example.Service1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class Service1Controller {
    @RequestMapping("/message")
        public String test(){
            return "This is service1";
        }
}

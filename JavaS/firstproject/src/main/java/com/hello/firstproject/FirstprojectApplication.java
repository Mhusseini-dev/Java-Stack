package com.hello.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstprojectApplication.class, args);
    }

    @RequestMapping("/")
    public String root() { // 3
        return "Hello, Visitor!, welcome to my humble website.";
    }

    @RequestMapping("/random")
    public String random() { // 3
        return "How much wood would a wood-chuck chuck if a wood-chuck could chuck wood";

    }
}

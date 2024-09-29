package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
	@Autowired
    private Student student;

    @RequestMapping("/student")
    public String hello(){
        return student.getInfo();
    }

}

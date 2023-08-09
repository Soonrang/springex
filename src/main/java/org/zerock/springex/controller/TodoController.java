package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
@Log4j2
public class TodoController {

    @RequestMapping("/list")
    public void list() {
        log.info("Todo list!");
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void register() {
        log.info("todo register! ");
    }
    @PostMapping("/register")
    public void registerPost() {
        log.info("Post todo register");
    }

    @GetMapping("/ex1")
    public void ex1(String name, int age) {
        log.info("ex1입니다!");
        log.info("이름: " + name);
        log.info("나이: " +age);
    }
}

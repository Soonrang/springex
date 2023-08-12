package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.springex.dto.TodoDTO;

import java.time.LocalDate;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

//    @RequestMapping("/list")
//    public void list() {
//        log.info("todo list!");
//    }
//
//    @GetMapping("/register")
//    public void registerGET()  {
//        log.info("GET todo register");
//    }
//
//    @PostMapping("/register")
//    public void registerPost(TodoDTO todoDTO) {
//        log.info("POST todo register");
//        log.info(todoDTO);
//    }

    @RequestMapping("/list")
    public void list(Model model){
        log.info("todo list");
    }

    @PostMapping("/register")
    public String registerPost(TodoDTO todoDTO, RedirectAttributes redirectAttributes)
    {
        log.info("POST todo Register");
        log.info(todoDTO);
        return "redirect:/todo/list";
    }
    @GetMapping("/register")
    public void registerGET() {
        log.info("GET todo register");
    }
}

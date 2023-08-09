package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {
    // /hello 라는 경로를 호출 할 때 동작한다.
    @GetMapping("/hello")
    public void hello() {
        log.info("안녕!");
    }
}

package com.example.Service_B_logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
@Slf4j
public class greetingController {
    @GetMapping
    public String greeting(){
        log.info("Hello message from B");
        return "hello from b";
    }
}

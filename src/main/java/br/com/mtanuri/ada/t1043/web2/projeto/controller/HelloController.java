package br.com.mtanuri.ada.t1043.web2.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}

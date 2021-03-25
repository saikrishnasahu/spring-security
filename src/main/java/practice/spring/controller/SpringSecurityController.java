package practice.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringSecurityController {

    @GetMapping
    public String printHello(){
        return ("<h1>Hello</h1>");
    }
}

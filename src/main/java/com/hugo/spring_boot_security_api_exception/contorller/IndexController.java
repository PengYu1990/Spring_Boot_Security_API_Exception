package com.hugo.spring_boot_security_api_exception.contorller;


import com.hugo.spring_boot_security_api_exception.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        throw new ResourceNotFoundException("404");
    }
}

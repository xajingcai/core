package com.myboot.core.coreController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/controller")
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String helloIndex(){
        return "index";
    }
}

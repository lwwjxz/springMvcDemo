package com.spring.mvc.study.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/demo")
public class DemoController {

    @GetMapping(value = "hello")
    @ResponseBody
    public String test() {
        return "hello";
    }
}

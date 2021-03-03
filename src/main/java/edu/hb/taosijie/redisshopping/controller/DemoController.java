package edu.hb.taosijie.redisshopping.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {
    private static final Logger log = LoggerFactory.getLogger(DemoController.class);
    @RequestMapping("/helloWorld")
    public String hello(Model model) {
        String name = "jiangbei";
        model.addAttribute("name", name);
        return "hello";
    }

}

package main.java.peter.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Piotr Kulma on 27.02.15.
 */

@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("/test")
    public String helloWorld() {
        return "hello";
    }
}

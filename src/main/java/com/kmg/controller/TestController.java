package com.kmg.controller;

import com.kmg.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {

    @RequestMapping("/welcome")
    public @ResponseBody Message addNewUser () {
        return new Message("Welcome to KMG 2019");
    }

}

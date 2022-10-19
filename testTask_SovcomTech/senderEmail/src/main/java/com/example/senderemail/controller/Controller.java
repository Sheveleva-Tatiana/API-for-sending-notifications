package com.example.senderemail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


@RestController
@RequestMapping("/send")
public class Controller {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());

    @GetMapping("/email")
    public String sendEmail(@RequestParam(value = "msg", required = false) String msg) throws IOException {
        logger.addHandler(new FileHandler());
        logger.info("email was send. Msg: " + msg);
        return "Message: \"" + msg + "\"\n  was send by Email";
    }
}

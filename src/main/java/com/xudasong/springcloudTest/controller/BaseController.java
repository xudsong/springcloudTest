package com.xudasong.springcloudTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author song
 * @since 2023-04-26
 */
@RestController
public class BaseController {

    @GetMapping("/ping")
    public String ping(){
        return "ping";
    }

}

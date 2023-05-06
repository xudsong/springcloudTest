package com.xudasong.springcloudTest.controller;

import com.xudasong.springcloudTest.pojo.vo.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author song
 * @since 2023-04-26
 */
@RestController
@Slf4j
public class BaseController {

    @GetMapping("/ping")
    @ResponseBody
    public BaseResult<String> ping(){
        log.info("ping");
        return BaseResult.OK("success");
    }

}

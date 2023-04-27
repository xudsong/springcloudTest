package com.xudasong.springcloudTest.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xudasong.springcloudTest.entity.UserDb;
import com.xudasong.springcloudTest.service.UserDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xudasong
 * @since 2023-04-27
 */
@RestController
@RequestMapping("/userDb")
@RequiredArgsConstructor
public class UserDbController {

    private final UserDbService userDbService;

    @GetMapping("/get")
    public List<UserDb> get(){
        LambdaQueryWrapper<UserDb> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        List<UserDb> userDbList = userDbService.list(lambdaQueryWrapper);
        return userDbList;
    }

}


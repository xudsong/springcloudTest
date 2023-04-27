package com.xudasong.springcloudTest.controller;


import com.xudasong.springcloudTest.entity.UserDb;
import com.xudasong.springcloudTest.service.IUserDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tingdian
 * @since 2023-04-27
 */
@RestController
@RequestMapping("/userDb")
@RequiredArgsConstructor
public class UserDbController {

    private final IUserDbService userDbService;

    @GetMapping("/get")
    public List<UserDb> get(){
        return userDbService.list();
    }

}


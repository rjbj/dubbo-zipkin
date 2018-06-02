package com.galaxy.zipkin.zipkinall.controller;

import com.galaxy.zipkin.zipkinall.model.User;
import com.galaxy.zipkin.zipkinall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("userList")
    public List<User> queryList(){
        return userService.getUserList();
    }
}

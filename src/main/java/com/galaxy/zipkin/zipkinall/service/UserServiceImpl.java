package com.galaxy.zipkin.zipkinall.service;

import com.galaxy.hystrix.HelloService;
import com.galaxy.zipkin.ZipkinService;
import com.galaxy.zipkin.zipkinall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private HelloService helloService;
    @Autowired
    private ZipkinService zipkinService;

    public List<User> getUserList() {
        zipkinService.helloworld();
        helloService.sayHello();
        List<User> list = new ArrayList<>();
        list.add(new User(1l, "dada", 11));
        list.add(new User(2l, "haha", 21));
        return list;
    }
}

package org.lanqiao.msg.controller;

import org.lanqiao.msg.enity.user;
import org.lanqiao.msg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
//类需要自动生成对象
//类中方法返回json
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/get")
    public List<user> getAll(int pageSize, int pageNum) {
//        List<User> use=userService.getAllUser();
//        for( User u:use)
//        System.out.println(u);
        return userService.getAllUser( pageSize, pageNum);

    }
    @RequestMapping("/get_all")
    public List<user> getAll() {
//        List<User> use=userService.getAllUser();
//        for( User u:use)
//        System.out.println(u);
        return userService.getAllUser();

    }
    @RequestMapping("/send")
    public boolean send(user user) {
        System.out.println("\n");
        System.out.println(user);
        System.out.println("\n");
        return userService.send(user);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello!";
    }
    @RequestMapping("/set")
    public String set(){ return "this is ont";}
}

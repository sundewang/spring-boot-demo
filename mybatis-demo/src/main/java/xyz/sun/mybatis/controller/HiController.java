package xyz.sun.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.sun.mybatis.service.UserService;

/**
 * @author sundewang
 * @date 2025/3/29
 */
@RestController
public class HiController {
    @Autowired
    UserService service;

    @GetMapping("/count")
    public int countUser(@RequestParam String updateTime) {
        int count = service.count(updateTime);
        return count;
    }
}

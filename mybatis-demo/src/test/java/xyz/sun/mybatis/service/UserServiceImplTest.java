package xyz.sun.mybatis.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.sun.mybatis.entity.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sundewang
 * @date 2020/7/13
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    void count() {
        assertEquals(3, userService.count("2020-07-01"));
    }

    @Test
    void addUser() {
        List<User> users = new ArrayList<>();
        users.add(new User("zhang", 26));
        users.add(new User("sun", 27));
        users.add(new User("guo", 27));
        int i = userService.addUsers(users);
        System.out.println(i);
    }
}
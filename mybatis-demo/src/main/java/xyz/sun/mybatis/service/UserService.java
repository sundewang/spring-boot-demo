package xyz.sun.mybatis.service;

import xyz.sun.mybatis.entity.User;

import java.util.List;

/**
 * @author sundewang
 * @date 2020/7/13
 */
public interface UserService {

    int count(String updateTime);

    int addUsers(List<User> users);
}

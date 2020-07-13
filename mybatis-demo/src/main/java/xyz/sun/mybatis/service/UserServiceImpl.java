package xyz.sun.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.sun.mybatis.entity.User;
import xyz.sun.mybatis.mapper.UserMapper;

import java.util.List;

/**
 * @author sundewang
 * @date 2020/7/13
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int count(String updateTime) {
        return userMapper.count(updateTime);
    }

    @Override
    public int addUsers(List<User> users) {
        return userMapper.addUser(users);
    }
}

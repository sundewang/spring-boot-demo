package xyz.sun.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.sun.mybatis.entity.User;

import java.util.List;

/**
 * @author sundewang
 * @date 2020/7/13
 */
@Mapper
public interface UserMapper {

    @Select("select count(*) from `t_user` where update_time > #{updateTime}")
    int count(String updateTime);

    @Insert("<script>insert into `t_user` ( `name`, `age`) value " +
            "<foreach collection='users' item='user' separator=','>" +
            "(#{user.name}, #{user.age})" +
            "</foreach></script>")
    int addUser(List<User> users);
}

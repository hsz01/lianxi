package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    public List<User> findAll();

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{userId}")
    public User findById(Integer userId);

    /**
     * 更新用户
     * @param user
     */
    @Select("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    public void updateUser(User user);
}

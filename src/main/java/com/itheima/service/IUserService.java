package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface IUserService {

    /**
     * 查询用户列表
     * @return
     */
    public List<User> findAll();

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    public User findById(Integer userId);

    /**
     * 跟新数据
     * @param user
     */
    public void updateUser(User user);
}

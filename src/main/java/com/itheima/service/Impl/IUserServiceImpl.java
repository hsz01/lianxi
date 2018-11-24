package com.itheima.service.Impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    @Override
    public User findById(Integer userId) {
        return userDao.findById(userId);
    }

    /**
     * 跟新用户数据
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}

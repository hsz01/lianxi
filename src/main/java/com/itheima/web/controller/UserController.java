package com.itheima.web.controller;

import com.itheima.domain.User;
import com.itheima.service.Impl.IUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
@Controller //这个一个控制器文件要加这个注解
@RequestMapping("/user") //给这个文件起个名字,让前端好找到这个文件
public class UserController {

    @Autowired
    private IUserServiceImpl userService;

    /**
     * 查询所有的用户信息
     * @return
     */
    @RequestMapping("findAll")
    public List<User> findAll(){
        List<User> list = userService.findAll();
        return list;
    }

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    @RequestMapping("userId")
    public User findById(Integer userId){
        return userService.findById(userId);
    }

    /**
     * 更新用户信息
     * @param user
     */
    @RequestMapping("user")
    public void updateUser(User user){
        userService.updateUser(user);
    }

}

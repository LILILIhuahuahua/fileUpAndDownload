package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author HuaHua
 * @create 2021-02-23 16:56
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService ;

    /**
     * 登录方法
     */
    @PostMapping("login")
    public String login(User user, HttpSession session){
        User userDB = userService.login(user);
        //DB中查到用户
        if(userDB!=null){
            session.setAttribute("user",userDB);
            return "redirect:/file/showAll";  //登陆成功，跳转展示用户所有文件的界面
        }else{
            return "redirect:/index";
        }
    }
}

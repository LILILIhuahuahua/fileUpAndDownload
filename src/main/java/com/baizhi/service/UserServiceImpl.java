package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author HuaHua
 * @create 2021-02-23 16:54
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDAO;



    @Override
    @Transactional(propagation = Propagation.SUPPORTS)  //事务的支持
    public User login(User user) {
        return userDAO.login(user);
    }
}

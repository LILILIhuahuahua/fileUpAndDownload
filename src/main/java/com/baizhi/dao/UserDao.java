package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author HuaHua
 * @create 2021-02-23 16:43
 */

@Mapper
@Repository
public interface UserDao {
    User login(User user);
}

package com.baizhi.dao;

import com.baizhi.entity.UserFile;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserFileDAO {

    //根据登录用户id获取用户的文件列表
    List<UserFile> findByUserId(Integer id);

    //保存用户的文件记录
    void save(UserFile userFile);

    //根据文件id获取文件信息
    UserFile findById(String id);

    //根据id更新下载次数
    void updateDownCount(UserFile userFile);

    //根据id删除记录
    void delete(String id);
}

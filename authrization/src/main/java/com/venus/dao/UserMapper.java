package com.venus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.venus.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    public User getUserByUsername(String username);
}

package com.venus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.venus.bean.User;
import com.venus.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;


    @Override
    public User getByUsername(String username) {
        QueryWrapper<User> wrapper= new QueryWrapper<User>();
        wrapper.eq("username",username);
        return userMapper.selectList(wrapper).get(0);

    }

    @Override
    public Set<String> getRoles(String username) {

        return null;
    }

    @Override
    public Set<String> getPermissions(String username) {
        return null;
    }
}

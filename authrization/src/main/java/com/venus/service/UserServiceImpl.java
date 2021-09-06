package com.venus.service;

import com.venus.bean.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService{


    @Override
    public User getByUsername(String username) {
        return null;
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

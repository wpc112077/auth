package com.venus.service;

import com.venus.bean.Role;
import com.venus.bean.User;

import java.util.Set;

public interface UserService {

    public User getByUsername(String username);

    public Set<String> getRoles(String username);

    public Set<String> getPermissions(String username);
}

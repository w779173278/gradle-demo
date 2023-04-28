package com.bocloud.subprojectdemo01.service.impl;

import com.bocloud.subprojectdemo01.service.UserService;
import com.bocloud.subprojectdemo01.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    static List<User> data = new ArrayList<>();
    static Integer id = 1;

    private Integer getId() {
        return id++;
    }

    @Override
    public User getById(Integer id) {
        return new User();
    }

    @Override
    public boolean add(User user) {
        user.setId(getId());
        data.add(user);
        return true;
    }

    @Override
    public List<User> list() {
        return data;
    }
}

package com.bocloud.subprojectdemo01.service;

import com.bocloud.subprojectdemo01.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("user")
public interface UserService {
    @GetMapping("/{id}")
    User getById(@PathVariable("id") Integer id);

    @PostMapping
    boolean add(@RequestBody User user);

    @GetMapping
    List<User> list();
}

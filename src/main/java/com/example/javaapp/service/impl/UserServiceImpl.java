package com.example.javaapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.javaapp.entity.User;
import com.example.javaapp.repository.UserRepository;
import com.example.javaapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

}

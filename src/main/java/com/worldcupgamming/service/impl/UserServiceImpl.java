/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.worldcupgamming.service.impl;

import com.worldcupgamming.mapper.UserMapper;
import com.worldcupgamming.model.User;
import com.worldcupgamming.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xingchi.wxc
 * @version $Id: UserServiceImpl, v 0.1 14-5-22 下午2:34 xingchi.wxc Exp $$
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}

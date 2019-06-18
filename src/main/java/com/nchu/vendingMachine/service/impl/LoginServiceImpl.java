package com.nchu.vendingMachine.service.impl;

import com.nchu.vendingMachine.dao.UserMapper;
import com.nchu.vendingMachine.entity.User;
import com.nchu.vendingMachine.entity.UserExample;
import com.nchu.vendingMachine.service.LoginService;
import com.nchu.vendingMachine.util.EncryptBasedDes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 162015班 第13组
 * 智能售货机后台管理系统——登录模块
 *
 * @Author: 16201533朱天保
 * @Date: 2019/6/17 21:20
 * @Version 1.0
 */
@Component
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> login(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAccountEqualTo(user.getAccount()).andPasswordEqualTo(EncryptBasedDes.encryptBasedDes(user.getPassword()));
        return userMapper.selectByExample(userExample);
    }
}
package com.nchu.vendingMachine.service;

import com.nchu.vendingMachine.entity.User;

import java.util.List;

/**
 * 162015班 第13组
 * 智能售货机后台管理系统——登录
 * @Author: 16201525 夏秋雨
 * @Date: 2019/6/11 21:19
 * @Version 1.0
 */
public interface LoginService {
    List<User> login(User user);
}

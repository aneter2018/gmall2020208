package com.aneter.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.aneter.gmall.bean.UserInfo;
import com.aneter.gmall.service.UserService;
import com.aneter.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userList(){

        List<UserInfo> userInfos = userInfoMapper.selectAllUserAndAddress();

        return userInfos;
    }

}

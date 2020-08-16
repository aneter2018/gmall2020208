package com.aneter.gmall.user.service.impl;


import com.aneter.gmall.user.bean.UserInfo;
import com.aneter.gmall.user.mapper.UserInfoMapper;
import com.aneter.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

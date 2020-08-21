package com.aneter.gmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.aneter.gmall.bean.UserInfo;
import com.aneter.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("userList")
    @ResponseBody
    public List<UserInfo> userList() {

        List<UserInfo> userInfos = userService.userList();
        return userInfos;
    }
}

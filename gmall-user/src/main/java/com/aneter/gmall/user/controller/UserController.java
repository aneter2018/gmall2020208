package com.aneter.gmall.user.controller;

import com.aneter.gmall.user.bean.UserInfo;
import com.aneter.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("userList")
    @ResponseBody
    public List<UserInfo> userList() {

        List<UserInfo> userInfos = userService.userList();
        return userInfos;
    }
}

package com.sunny.icloth.controller;

import com.sunny.icloth.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author feng yanli
 * @time 2016/10/1 17:16
 */
@Controller("userInfoController")
@RequestMapping(value = "")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String toRegister() throws Exception {
        return"register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(@RequestParam("username") String username,
                         @RequestParam("firstPsw") String firstPsw,
                         @RequestParam("secondPsw") String secondPsw) throws Exception{
        try {
            if(!firstPsw.equals(secondPsw)) {
                throw new Exception("前后两次输入的密码不一致");
            }
            userInfoService.register(username, firstPsw);
        } catch (Exception e) {
            throw new Exception("注册失败！");
        }
        return "login";
    }


}

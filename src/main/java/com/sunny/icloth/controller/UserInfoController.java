package com.sunny.icloth.controller;

import com.sunny.icloth.entity.UserInfo;
import com.sunny.icloth.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * UserInfoController
 *
 * @author feng yanli
 * @time 2016/10/1 17:16
 */
@Controller
@RequestMapping(value = "")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = {"login",""}, method = RequestMethod.GET)
    public String toLogin() throws Exception {
        return "user/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) throws Exception {
        try {
            UserInfo userInfo = userInfoService.queryByUsername(username);
            Integer number = userInfoService.countByUsername(username);
           if(number.equals(0)) {
               model.addAttribute("login_err", "用户不存在!");
               return "redirect:login";
           }
            if(!userInfo.getPassword().equals(password)) {
                model.addAttribute("login_err", "密码不正确!");
                return "redirect:login";
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return "index";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String toRegister() throws Exception {
        return "user/register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(@RequestParam("username") String username,
                         @RequestParam("firstPsw") String firstPsw,
                         @RequestParam("secondPsw") String secondPsw,
                           Model model) throws Exception {
        try {
            if(!firstPsw.equals(secondPsw)) {
                model.addAttribute("login_err", "前后两次输入的密码不一致!");
                return "user/register";
            }
            userInfoService.register(username, firstPsw);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return "user/login";
    }
}

package com.sunny.icloth.test;

import com.sunny.icloth.entity.UserInfo;
import com.sunny.icloth.service.UserInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * userInfoServiceTest
 * @author feng yanli
 * @time 2016/9/30 9:53
 */
public class UserInfoServiceTest extends AbstractTestCase{
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void listAll() throws Exception {
        List<UserInfo> list = userInfoService.listAll();
    }

}

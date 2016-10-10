package com.sunny.icloth.service.impl;
import com.sunny.icloth.entity.UserInfo;
import com.sunny.icloth.mapper.UserInfoMapper;
import com.sunny.icloth.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * UserInfoServiceImpl
 *
 * @author feng yanli
 * @time 2016/9/29 16:32
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> listAll() throws Exception {
        try {
            return userInfoMapper.listAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class, Exception.class, RuntimeException.class})
    public void register(String username, String password) throws Exception {
        int number = userInfoMapper.countByUsername(username);
        try {
            if(number <= 0) {
                userInfoMapper.register(username, password);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public int countByUsername(String username) throws Exception {
        int number = 0;
        try {
           return number = userInfoMapper.countByUsername(username);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public UserInfo queryByUsername(String username) throws Exception {
        UserInfo userInfo = new UserInfo();
        try {
            if(username != null) {
                userInfo = userInfoMapper.queryByUsername(username);
            }
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
        return userInfo;
    }
}

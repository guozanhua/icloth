package com.sunny.icloth.service;

import com.sunny.icloth.entity.UserInfo;

import javax.net.ssl.SSLException;
import java.util.List;

/**
 * userInfoService
 *
 * @author feng yanli
 * @time 2016/9/29 16:31
 */
public interface UserInfoService {

    /**
     * 查询用户全部信息
     *
     * @return
     * @throws Exception
     */
    public List<UserInfo> listAll() throws Exception;

    /**
     * 注册账户
     *
     * @param username
     * @param password
     * @throws Exception
     */
    public void register(String username, String password) throws Exception;

    /**
     * 登录
     *
     * @param username
     * @param password
     * @throws Exception
     */
    public void login(String username, String password) throws Exception;

    /**
     * 根据用户名判断重复
     *
     * @param username
     * @return
     * @throws Exception
     */
    public int countByUsername(String username) throws Exception;

}

package com.sunny.icloth.mapper;

import com.sunny.icloth.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author feng yanli
 * @time 2016/9/29 16:30
 */
public interface UserInfoMapper {

    /**
     * 注册
     *
     * @param username
     * @param password
     * @throws Exception
     */
    public void register(@Param("username") String username, @Param("password") String password) throws Exception;

    /**
     * 查询全部信息
     *
     * @return
     * @throws Exception
     */
    public List<UserInfo> listAll() throws Exception;

    /**
     * 根据用户名判断重复
     *
     * @param username
     * @return
     * @throws Exception
     */
    public int countByUsername(String username) throws Exception;

    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     * @throws Exception
     */
    public UserInfo queryByUsername(String username) throws Exception;

}

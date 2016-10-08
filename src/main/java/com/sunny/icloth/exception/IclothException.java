package com.sunny.icloth.exception;


/**
 * 异常处理类
 * @Author: zhangteng
 * @Time: 2015/9/30 17:20.
 */
public enum IclothException {
    SystemException("系统内部异常", 1),
    SendSmsError("发送短信失败", 2),

    ImageCompressedFail("图片压缩失败!", 1001),
    UploadFileNotNull("上传的文件不能为空!", 1002),
    UploadPathNotNull("上传的文件路径不能为空!", 1003),
    UploadDirCreateFail("上传文件夹创建失败!", 1004),
    UploadFileFail("文件上传失败", 1005),
    DownloadQrCodeFail("下载二维码失败", 1006),

    // 用户管理模块
    PasswordNotSame("两边密码输入不一致", 2001),
    CheckPhoneFail("检查电话号码重名失败", 2002),
    NewUserInfoFail("添加用户信息失败", 2003),
    UpdateUserInfoStatusFail("修改用户信息状态失败", 2004),
    QueryUserInfoException("查询用户信息失败", 2005),
    UpdateUserPwdFail("修改用户密码失败", 2006),
    UpdateUserInfoFail("修改用户信息失败", 2007),
    DeleteUserInfoFail("删除用户信息失败", 2008),
    PhoneHasExist("该手机号已被注册", 2009),
    PhoneHasNotExist("该手机号尚未注册成为会员，无法找回密码", 2010),
    LoginFail("用户名不存在", 2011),

    PartyNotNull("添加当事人不能为空！",2003),
    EmployeeIsActivity("员工处于激活状态，请先将它转为未激活！",2008),
    PartyIdError("当事人ID为空或者小于0", 2010),
    CheckLoginNameFail("检查登录名重名失败",2013),
    OldPasswordWrong("原密码错误", 2014),
    PasswordNotEqual("两遍密码不一致", 2015),
    PasswordWrong("密码错误", 2016),
    PhoneError("电话号码错误", 2017),
    UserNotExist("不存在该用户", 2018),
    UserNotThisType("此用户不属于该身份", 2019),

    // 用户-地址管理模块
    QueryAllAddressFail("获取所有地址信息失败", 2200),
    CountAddressFail("统计地址数量失败", 2201),
    QueryAllAddressToPageFail("获取所有地址信息(分页显示)失败", 2202),
    AddressNotNull("地址不能为空",2203),
    PartyIdNotNull("用户Id不能为空",2204),
    NameNotNull("姓名不能为空",2205),
    SexIsError("性别为空或者输入错误",2206),
    PhoneIsError("电话为空或者输入错误",2207),
    UpdateAddressFail("修改地址信息失败",2208),
    DeleteAddressFail("默认地址不能删除", 2209),
    UpdateDefaultAddressFail("修改默认地址失败",2210),

    // 顾客端
    SendTooFrequently("两次获取验证码之间不可少于60秒，请稍后再试", 5001),
    ValidCodeWrong("验证码不正确", 5002),
    ValidCodeNotSend("尚未发送验证码", 5003),

    //地址管理模块
    AddressIdError("地址id为空或者小于0",5010),
    QueryAddressFail("查询地址失败",5011),
    IsDefaultAddress("该地址为默认地址，不能删除", 5012),
    DeleteAddressError("删除地址失败", 5013),
    ;



    private String msg;

    private int code;

    IclothException(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    IclothException(String msg) {
        this.msg = msg;
    }


    public String getMes() {
        return msg;
    }

    public int getCode() {
        return code;
    }
}

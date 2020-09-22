package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

public interface UserService {
    //根据id获取用户信息
    User getUser(Integer id);
    //增加用户积分
    void addScore(Integer id,Integer score);
}
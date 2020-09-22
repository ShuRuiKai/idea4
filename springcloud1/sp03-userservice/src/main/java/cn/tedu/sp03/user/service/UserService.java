package cn.tedu.sp03.user.service;

import cn.tedu.sp01.pojo.User;

public interface UserService {
    User getUser(Integer id);
    void addScore(Integer id,Integer score);
}

package cn.tedu.sp03.user.controller;

import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.web.util.JsonResult;
import cn.tedu.sp03.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/{userId}")
    public JsonResult<User> getUser(@PathVariable Integer userId) {
        log.info("get user, userId="+userId);
        User user = userService.getUser(userId);
        return JsonResult.ok().data(user);
    }

    @GetMapping("/{userId}/score")
    public JsonResult addScore(@PathVariable Integer userId, Integer score) {
        userService.addScore(userId, score);
        return JsonResult.ok().msg("增加用户积分成功");
    }

}

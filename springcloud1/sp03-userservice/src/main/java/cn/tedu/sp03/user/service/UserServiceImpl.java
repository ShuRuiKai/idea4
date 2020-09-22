package cn.tedu.sp03.user.service;

import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.web.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    //引用yml中的自定义属性
    @Value("${sp.user-service.users}")
    private String userJson;

    @Override
    public User getUser(Integer id) {
        //匿名内部类的格式创建，没有任何作用，只是为了用List<User>
        List<User> list = JsonUtil.from(userJson, new TypeReference<List<User>>() {});
        for (User user : list) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return new User(id, "name-"+id, "pwd-"+id);
    }
    @Override
    public void addScore(Integer id, Integer score) {
        // 这里增加积分
        log.info("user "+id+" - 增加积分 "+score);
    }
}

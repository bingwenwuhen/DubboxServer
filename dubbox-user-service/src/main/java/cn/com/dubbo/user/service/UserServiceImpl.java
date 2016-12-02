package cn.com.dubbo.user.service;

import cn.com.dubbo.bean.User;
import cn.com.dubbo.user.api.UserService;
import cn.com.dubbo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaxuan on 16/11/30.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}

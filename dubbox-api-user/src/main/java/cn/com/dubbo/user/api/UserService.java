package cn.com.dubbo.user.api;

import cn.com.dubbo.bean.User;

/**
 * Created by xiaxuan on 16/11/30.
 */
public interface UserService {

    void addUser(User user);

    User getUserById(Long id);
}

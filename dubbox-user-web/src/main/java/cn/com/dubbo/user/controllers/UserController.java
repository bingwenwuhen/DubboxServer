package cn.com.dubbo.user.controllers;

import cn.com.dubbo.bean.User;
import cn.com.dubbo.user.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaxuan on 16/12/1.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add.do", method = RequestMethod.POST,
                    produces = "application/json;charset=utf-8",
                    consumes = "application/json;charset=utf-8")
    public Object addUser(@RequestBody User user) {
        userService.addUser(user);
        Map<String, Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("msg", "成功");
        return result;
    }
}

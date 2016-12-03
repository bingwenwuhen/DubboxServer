package cn.com.dubbo.goods.controllers;

import cn.com.dubbo.bean.Order;
import cn.com.dubbo.goods.api.OrderService;
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
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/order/add", method = RequestMethod.POST,
                    consumes = "application/json;charset=utf-8",
                    produces = "application/json;charset=utf-8")
    public Object addOrder(@RequestBody Order order) {
        orderService.addOrder(order);
        Map<String, Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("msg", "hello world");
        return result;
    }
}

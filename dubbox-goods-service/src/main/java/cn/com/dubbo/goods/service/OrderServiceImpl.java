package cn.com.dubbo.goods.service;

import cn.com.dubbo.bean.Order;
import cn.com.dubbo.goods.api.OrderService;
import cn.com.dubbo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaxuan on 16/12/1.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void addOrder(Order order) {
        orderMapper.addOrder(order);
    }
}

package cn.com.dubbo.goods.controllers;

import cn.com.dubbo.bean.Goods;
import cn.com.dubbo.goods.api.GoodsService;
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
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/goods/add", method = RequestMethod.POST,
                    consumes = "application/json;charset=utf-8",
                    produces = "application/json;charset=utf-8")
    public Object addGoods(@RequestBody Goods goods) {
        goodsService.addGoods(goods);
        Map<String, Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("msg", "hello world");
        return result;
    }
}

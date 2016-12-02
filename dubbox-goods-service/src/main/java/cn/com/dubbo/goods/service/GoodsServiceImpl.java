package cn.com.dubbo.goods.service;

import cn.com.dubbo.bean.Goods;
import cn.com.dubbo.goods.api.GoodsService;
import cn.com.dubbo.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaxuan on 16/12/1.
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public void addGoods(Goods goods) {
        goodsMapper.addGoods(goods);
    }
}

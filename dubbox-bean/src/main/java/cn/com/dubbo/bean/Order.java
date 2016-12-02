package cn.com.dubbo.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiaxuan on 16/11/30.
 */
@Data
public class Order implements Serializable {

    private Long id;

    private Date createdAt;

    private Date updatedAt;

    private Long userId;

    private Long goodsId;

    private Double totalPrice;
}

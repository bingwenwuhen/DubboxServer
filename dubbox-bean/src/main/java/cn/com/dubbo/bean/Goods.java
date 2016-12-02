package cn.com.dubbo.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiaxuan on 16/11/30.
 */
@Data
public class Goods implements Serializable {

    private static final long serialVersionUID = -7615501466831943639L;

    private Long id;

    private String title;

    private Date createdAt;

    private Date updatedAt;

    private Double price;

    private Integer number;

    private Integer state;
}

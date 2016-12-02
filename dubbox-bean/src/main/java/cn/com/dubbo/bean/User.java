package cn.com.dubbo.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiaxuan on 16/11/30.
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 3301762487414731823L;

    private Long id;

    private String username;

    private String password;

    private Date createdAt;

    private Date updatedAt;

    private String mobile;

}
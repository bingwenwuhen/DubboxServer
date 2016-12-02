package cn.com.dubbo.mapper;

import cn.com.dubbo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xiaxuan on 16/11/30.
 */
public interface UserMapper {

    void addUser(User user);

    @Select("select * from t_user where id = #{id};")
    User getUserById(@Param("id") Long id);
}

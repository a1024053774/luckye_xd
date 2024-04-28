package com.luckye.mapper;

import com.luckye.pojo.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper extends BaseMapper<User>{
    /* 用户登录方法 */
    public User login(User user);
}
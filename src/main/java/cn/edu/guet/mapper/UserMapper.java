package cn.edu.guet.mapper;

import cn.edu.guet.model.User;

import java.util.List;

public interface UserMapper {
    User getUserForLogin(String username,String password);
}



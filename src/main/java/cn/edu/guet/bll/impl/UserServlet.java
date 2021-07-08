package cn.edu.guet.bll.impl;

import cn.edu.guet.bll.IUserServlet;
import cn.edu.guet.mapper.UserMapper;
import cn.edu.guet.model.User;
import cn.edu.guet.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServlet implements IUserServlet {

    @Override
    public User checkLogin(String username,String password) {
        SqlSession sqlSession = MybatisUtils.getSqlSesion();//创建sqlSession对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);//指定sqlSession对应的Mapper接口
        return userMapper.getUserForLogin(username,password);
    }
}

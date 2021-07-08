package cn.edu.guet.bll;

import cn.edu.guet.model.User;

public interface IUserServlet {
    User checkLogin(String username,String password);
}

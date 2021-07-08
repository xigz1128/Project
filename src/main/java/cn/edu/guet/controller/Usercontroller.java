package cn.edu.guet.controller;

import cn.edu.guet.bll.ITreeServlet;
import cn.edu.guet.bll.IUserServlet;

import cn.edu.guet.model.User;
import cn.edu.guet.mvc.annotaion.Controller;
import cn.edu.guet.mvc.annotaion.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Usercontroller {
    private IUserServlet UserServlet;

    public void setUserServlet(IUserServlet userServlet) {
        UserServlet = userServlet;
    }

    @RequestMapping("login.do")
    public String checkLogin(String username, String password, HttpSession Session){
        User user = UserServlet.checkLogin(username,password);
        if(user == null){
            System.out.println("登录失败");
            return "redirect:index.jsp";
        }else{
            //获取用户角色
            Session.setAttribute("user",user);
            System.out.println("登录成功");
            return "forward:main.jsp";
        }
    }

}

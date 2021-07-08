package cn.edu.guet.controller;

import cn.edu.guet.mvc.annotaion.Controller;
import cn.edu.guet.mvc.annotaion.RequestMapping;

@Controller
public class Reservecontroller {
    @RequestMapping("reserve.do")
    public String skipToreserve(){
        return "forward:reserve.jsp";
    }
}

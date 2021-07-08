package cn.edu.guet.controller;

import cn.edu.guet.mvc.annotaion.Controller;
import cn.edu.guet.mvc.annotaion.RequestMapping;

@Controller
public class Cartcontroller {
    @RequestMapping("viewcart.do")
    public String sikpToCart(){
        return "forward:Cart/viewCart.jsp";
    }
}

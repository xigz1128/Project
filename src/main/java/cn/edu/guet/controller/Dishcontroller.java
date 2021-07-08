package cn.edu.guet.controller;

import cn.edu.guet.model.Dish;
import cn.edu.guet.mvc.annotaion.Controller;
import cn.edu.guet.mvc.annotaion.RequestMapping;

import java.util.List;

@Controller
public class Dishcontroller {
    @RequestMapping("viewdish.do")
    public String getAllDishes(){
        return "forward:Dish/viewdish.jsp";
    }
}

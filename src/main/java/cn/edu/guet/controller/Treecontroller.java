package cn.edu.guet.controller;

import cn.edu.guet.bll.ITreeServlet;
import cn.edu.guet.model.Role;
import cn.edu.guet.model.Tree;
import cn.edu.guet.model.User;
import cn.edu.guet.mvc.annotaion.Controller;
import cn.edu.guet.mvc.annotaion.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Treecontroller {
    private ITreeServlet TreeServlet;

    public void setiTreeServlet(ITreeServlet iTreeServlet) {
        this.TreeServlet = iTreeServlet;
    }

    @RequestMapping("tree/getTreeByUser.do")
    public List<Tree> getTreeByUser(HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<Tree> userTree = new ArrayList<Tree>();
        for(Role role:user.getRoleList()){
            role.setTreeList(TreeServlet.getTreesByRole(role.getRole_id()));
            for (Tree tree:role.getTreeList()){
                if (!userTree.contains(tree)){
                    userTree.add(tree);
                }
            }
        }
        return userTree;
    }
}

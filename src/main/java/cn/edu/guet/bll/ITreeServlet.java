package cn.edu.guet.bll;

import cn.edu.guet.model.Role;
import cn.edu.guet.model.Tree;
import cn.edu.guet.model.User;

import java.util.List;

public interface ITreeServlet {
    List<Tree> getTreesByRole(String role_id);
}

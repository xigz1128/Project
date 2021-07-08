package cn.edu.guet.mapper;

import cn.edu.guet.model.Role;
import cn.edu.guet.model.Tree;
import cn.edu.guet.model.User;

import java.util.List;

public interface TreeMapper {
    List<Tree> getTreeByRole(String role_id);
}

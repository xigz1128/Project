package cn.edu.guet.bll.impl;

import cn.edu.guet.bll.ITreeServlet;
import cn.edu.guet.mapper.TreeMapper;
import cn.edu.guet.model.Role;
import cn.edu.guet.model.Tree;
import cn.edu.guet.model.User;
import cn.edu.guet.utils.MybatisUtils;

import java.util.List;

public class TreeServlet implements ITreeServlet {

    @Override
    public List<Tree> getTreesByRole(String role_id) {
        TreeMapper treeMapper = MybatisUtils.getSqlSesion().getMapper(TreeMapper.class);
        return treeMapper.getTreeByRole(role_id);
    }
}

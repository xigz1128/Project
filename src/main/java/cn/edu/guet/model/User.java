package cn.edu.guet.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String user_id;
    private String user_name;
    private String password;
    private String realname;
    private String phone;
    private String address;
    private List<Role> roleList=new ArrayList<Role>();
    private List<Cart> Cartlist=new ArrayList<Cart>();

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public List<Cart> getCartlist() {
        return Cartlist;
    }

    public void setCartlist(List<Cart> cartlist) {
        Cartlist = cartlist;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

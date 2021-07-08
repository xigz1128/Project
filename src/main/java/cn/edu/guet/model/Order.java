package cn.edu.guet.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String order_id;
    private String table_id;
    private String order_time;
    private float amount;
    private String paytype;
    private String form;
    private User user;
    private String remarks;
    private List<Dish> dishlist = new ArrayList<Dish>();

    public List<Dish> getDishlist() {
        return dishlist;
    }

    public void setDishlist(List<Dish> dishlist) {
        this.dishlist = dishlist;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getTable_id() {
        return table_id;
    }

    public void setTable_id(String table_id) {
        this.table_id = table_id;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

package cn.edu.guet.model;

public class Food {
    private String food_id;
    private String food_name;
    private float inprice;
    private float stock;

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public float getInprice() {
        return inprice;
    }

    public void setInprice(float inprice) {
        this.inprice = inprice;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }
}

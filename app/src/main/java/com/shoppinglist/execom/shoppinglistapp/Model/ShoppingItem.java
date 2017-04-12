package com.shoppinglist.execom.shoppinglistapp.Model;

/**
 * Created by mihajlo on 4/11/2017.
 */

public class ShoppingItem {
    String name;
    String price;

    public ShoppingItem(String name, String price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

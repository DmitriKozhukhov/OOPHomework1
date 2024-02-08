package org.example;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> listOfProducts;

    public Category(String name, ArrayList<Product> listOfProducts) {
        this.name = name;
        this.listOfProducts = listOfProducts;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(ArrayList<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    @Override
    public String toString() {
        String s = name + "\n" +
                "Список продуктов: \n" + listOfProducts +"\n";
        return  s;
    }
}

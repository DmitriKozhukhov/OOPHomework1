package org.example;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList <Category> storeList = new ArrayList<>();
        Product banana = new Product("Банан", 10.5, 4);
        Product apple  = new Product("Яблоко", 8.5, 4.7);
        Product orange = new Product("Апельсин", 12, 3.1);
        Product juice = new Product("Сок", 10, 3.5);
        Product lemonade  = new Product("Лемонад", 9, 3.9);
        Product milk = new Product("Молоко", 8, 3.1);
        Product beef = new Product("Говядина", 12, 5);
        Product chicken = new Product("Курица", 8.5, 4.2);
        Product bacon = new Product("Бекон", 9.5, 3.3);

        ArrayList <Product> fruitsList = new ArrayList<>();
        fruitsList.add(banana);
        fruitsList.add(apple);
        fruitsList.add(orange);
        Category fruits = new Category("Фрукты", fruitsList);
        ArrayList <Product> drinksList = new ArrayList<>();
        drinksList.add(juice);
        drinksList.add(lemonade);
        drinksList.add(milk);
        Category drinks = new Category("Напитки", drinksList);
        ArrayList<Product>  meatList = new ArrayList<>();
        meatList.add(beef);
        meatList.add(chicken);
        meatList.add(bacon);
        Category meat  = new Category("Мясо", meatList);

        storeList.add(fruits);
        storeList.add(drinks);
        storeList.add(meat);
        System.out.println(storeList);
//        fruits.addProduct(banana);
//        fruits.addProduct(apple);
//        fruits.addProduct(orange);
//
//        drinks.addProduct(juice);
//        drinks.addProduct(lemonade);
//        drinks.addProduct(milk);
//
//        meat.addProduct(beef);
//        meat.addProduct(chicken);
//        meat.addProduct(bacon);

    }
}
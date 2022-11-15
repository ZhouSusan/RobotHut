package org.example;
import Dishes.Burger;

public class ChefBotApp {
    public static void main(String[] args) {
        Burger order1 = new Burger(1, "CheeseBurger", 10.99, 2);
        System.out.println(order1.getTotal());
    }
}
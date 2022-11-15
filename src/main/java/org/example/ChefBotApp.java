package org.example;
import Dishes.Burger;

public class ChefBotApp {
    public static void main(String[] args) {
        Burger order1 = new Burger(2);
        System.out.println(order1.getTotal());
    }
}
package org.example;
import Dishes.Burger;

public class ChefBotApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bob Burgers", 120);
        Burger order1 = new Burger(2);
        System.out.println(order1.getTotal());
        System.out.println(customer1.checkBalance(customer1.getBalance(), order1.getTotal()));
    }
}
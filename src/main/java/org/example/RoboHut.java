package org.example;
import Dishes.Burger;
import Dishes.Pizza;

public class RoboHut {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bob Burgers", 120);
        Burger order1 = new Burger(2);
        Pizza pizOrder1 = new Pizza(1);
        CustomerOrder customer1Order = new CustomerOrder(customer1);
        System.out.println(order1.getTotal());
        System.out.println(customer1.checkBalance(customer1.getBalance(), order1.getTotal()));
        customer1Order.addMeal(order1);
        customer1Order.addMeal(pizOrder1);
        OrderList totalOrderList = new OrderList();
        totalOrderList.addCustomerOrder(customer1Order.getCustomerOrderTotal());
        System.out.println(customer1Order.getCustomerOrderTotal());
        System.out.println(totalOrderList.getTotalOrders());
    }
}
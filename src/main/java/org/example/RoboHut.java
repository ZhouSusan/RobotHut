package org.example;
import Dishes.Burger;
import Dishes.Pizza;
import Robots.ButlerBot;
import Robots.ChefBot;
import Robots.FrontDeskBot;
import Robots.ManagerBot;

public class RoboHut {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bob Burgers", 120);
        Burger order1 = new Burger(2);
        Pizza pizOrder1 = new Pizza(1);
        CustomerOrder customer1Order = new CustomerOrder(customer1);
        customer1Order.addMeal(order1);
        customer1Order.addMeal(pizOrder1);
        OrderList totalOrderList = new OrderList();
        ChefBot chefBot1 = new ChefBot("Steve");
        ButlerBot butlerBot1 = new ButlerBot("Jules");
        FrontDeskBot frontDeskBot1 = new FrontDeskBot("Ducky");
        ManagerBot clarie = new ManagerBot(chefBot1, frontDeskBot1, butlerBot1);
        clarie.orderFrontDeskGreetCustomer();
        clarie.orderButlerToTakeOrder(customer1Order);
        clarie.orderChefToCook(pizOrder1);
        clarie.orderFrontDeskToGetCheck(customer1Order);
    }
}
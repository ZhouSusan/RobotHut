package org.example;
import Dishes.Burger;
import Dishes.Pizza;
import Dishes.Sandwich;
import Robots.ButlerBot;
import Robots.ChefBot;
import Robots.FrontDeskBot;
import Robots.ManagerBot;

public class RobotHut {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bob Burgers", 220);
        Burger order1 = new Burger(2);
        Pizza pizOrder1 = new Pizza(1);
        Sandwich sandwichOder1 = new Sandwich(2);
        CustomerOrder customer1Order = new CustomerOrder(customer1);
        customer1Order.addMeal(order1);
        customer1Order.addMeal(pizOrder1);
        customer1Order.addMeal(sandwichOder1);

        OrderList totalOrderList = new OrderList();
        totalOrderList.addCustomerOrder(customer1Order.getCustomerOrderTotal());

        ChefBot chefBot1 = new ChefBot("Steve");
        ButlerBot butlerBot1 = new ButlerBot("Jules");
        FrontDeskBot frontDeskBot1 = new FrontDeskBot("Ducky");

        ManagerBot clarie = new ManagerBot(chefBot1, frontDeskBot1, butlerBot1);

        clarie.orderFrontDeskGreetCustomer();
        System.out.println("************************************************");
        clarie.orderButlerToTakeOrder(customer1Order);
        System.out.println("************************************************");
        clarie.orderChefToCook(order1);
        System.out.println("************************************************");
        clarie.orderChefToCook(pizOrder1);
        System.out.println("************************************************");
        clarie.orderChefToCook(sandwichOder1);
        System.out.println("************************************************");
        clarie.orderFrontDeskToGetCheck(customer1Order);
        System.out.println("\n************************************************");
    }
}
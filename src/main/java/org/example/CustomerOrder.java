package org.example;
import java.util.*;
import Base.FoodBase;

public class CustomerOrder {
    private Customer _customer;
    private List<FoodBase> customerOrders = new ArrayList<FoodBase>();

    public CustomerOrder(Customer customer) {
        this._customer = customer;
    }

    public void addMeal(FoodBase meal) {
        customerOrders.add(meal);
    }

    public void deleteMeal(FoodBase meal) {
        customerOrders.remove(meal);
    }

    public double getCustomerOrderTotal() {
        double total = 0;
        for (FoodBase i : customerOrders) {
            total += i.getTotal();
        }
        return total;
    }
}

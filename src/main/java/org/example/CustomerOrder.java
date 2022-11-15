package org.example;
import java.text.DecimalFormat;
import java.util.*;
import Base.FoodBase;

public class CustomerOrder {
    private Customer _customer;
    private List<FoodBase> customerOrders = new ArrayList<FoodBase>();
    private static final DecimalFormat decformat = new DecimalFormat("0.00");

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
        double res = Double.parseDouble(((decformat.format(total))));
        return res;
    }
}

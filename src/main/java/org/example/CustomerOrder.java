package org.example;
import java.util.*;
import Base.FoodBase;

public class CustomerOrder {
    private Customer _customer;
    private List<FoodBase> customerOrders = new ArrayList<FoodBase>();

    public CustomerOrder(Customer customer) {
        this._customer = customer;
    }
}
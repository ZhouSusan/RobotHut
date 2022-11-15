package org.example;
import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private CustomerOrder _customerOrder;
    private List<CustomerOrder> totalOrders = new ArrayList<CustomerOrder>();

    public OrderList(CustomerOrder customerOrder) {
        this._customerOrder = customerOrder;
    }

    
}

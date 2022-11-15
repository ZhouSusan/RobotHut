package org.example;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private CustomerOrder _customerOrder;
    private List<Double> totalOrders;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public OrderList() {
        totalOrders = new ArrayList<Double>();
    }

    public void addCustomerOrder(double customerOrderAmount) {
        totalOrders.add(customerOrderAmount);
    }

    public void removeCustomerOrder(double customerOrderAmount) {
        int idx = totalOrders.indexOf(customerOrderAmount);
        totalOrders.remove(idx);
    }

    public double getTotalOrders() {
        double total = 0;
        for (int i = 0; i < totalOrders.size(); i++) {
            total += totalOrders.get(i);
        }
        return Double.parseDouble(df.format(total));
    }
}

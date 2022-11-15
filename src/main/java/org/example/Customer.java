package org.example;

public class Customer {
    private String customerName;
    private double balance;

    public Customer(String name, int bal) {
        this.customerName = name;
        this.balance = bal;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getName() {
        return this.customerName;
    }

    public void setBalance(int bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean checkBalance(double bal, double amountOwe) {
        return (amountOwe <= bal);
    }

}

package com.list.bank;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
//        Customer customer = findCustomer(name);
        if (findCustomer(name) == null) {
//            customer = new Customer(name, initialTransaction);
            customers.add(new Customer(name, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer == null) {
            return false;
        }
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer existingCustomer = this.customers.get(i);
            if (existingCustomer.getName().equals(name)) {
                return existingCustomer;
            }
        }
        return null;
    }
}

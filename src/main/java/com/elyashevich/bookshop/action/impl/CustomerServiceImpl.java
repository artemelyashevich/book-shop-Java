package com.elyashevich.bookshop.action.impl;

import com.elyashevich.bookshop.action.CustomerService;
import com.elyashevich.bookshop.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> generate() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "James Smith", 21));
        customers.add(new Customer(2, "Maria Garcia", 31));
        customers.add(new Customer(3, "Maria Rodriguez", 41));
        customers.add(new Customer(4, "Maria Hernandez", 51));
        customers.add(new Customer(5, "Robert Smith", 27));
        return customers;
    }


}

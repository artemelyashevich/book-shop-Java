package com.elyashevich.bookshop.action.impl;

import com.elyashevich.bookshop.action.OrderService;
import com.elyashevich.bookshop.main.Main;
import com.elyashevich.bookshop.model.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> generate() {

        //orders
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1, Main.customers.get(1), Main.employees.get(2), Arrays.asList(Main.books.get(1), Main.books.get(2))));
        orders.add(new Order(2, Main.customers.get(2), Main.employees.get(2), Arrays.asList(Main.books.get(3), Main.books.get(5))));
        orders.add(new Order(3, Main.customers.get(1), Main.employees.get(2), Arrays.asList(Main.books.get(5), Main.books.get(4))));
        orders.add(new Order(4, Main.customers.get(2), Main.employees.get(0), Arrays.asList(Main.books.get(1), Main.books.get(3))));
        orders.add(new Order(5, Main.customers.get(0), Main.employees.get(0), Arrays.asList(Main.books.get(1), Main.books.get(2))));
        return orders;
    }
}

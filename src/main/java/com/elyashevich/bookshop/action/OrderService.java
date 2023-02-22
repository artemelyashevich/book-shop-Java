package com.elyashevich.bookshop.action;

import com.elyashevich.bookshop.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> generate();
}

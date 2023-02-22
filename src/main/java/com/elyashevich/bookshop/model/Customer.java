package com.elyashevich.bookshop.model;

public class Customer extends Person {
    public Customer(long id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + "}";
    }
}

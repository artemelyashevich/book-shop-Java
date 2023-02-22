package com.elyashevich.bookshop.model;

import com.elyashevich.bookshop.model.Person;

public class Employee extends Person {
    public Employee(long id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + "}";
    }
}

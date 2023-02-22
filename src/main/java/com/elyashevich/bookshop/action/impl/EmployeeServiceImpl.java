package com.elyashevich.bookshop.action.impl;

import com.elyashevich.bookshop.action.EmployeeService;
import com.elyashevich.bookshop.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> generate() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ivan Ivanov", 20));
        employees.add(new Employee(2, "Petr Petrov", 30));
        employees.add(new Employee(3, "Stepan Stepanov", 20));
        return employees;
    }

}

package com.elyashevich.bookshop.model;

import java.util.Objects;

public class Profit {
    private Employee employee;
    private float price;
    private float count;

    public Profit(Employee employee, float price, float count) {
        this.employee = employee;
        this.price = price;
        this.count = count;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\tSold books - " + count + "\n\tPrice - " + price + "$\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profit profit = (Profit) o;
        return Float.compare(profit.price, price) == 0 && Float.compare(profit.count, count) == 0 && Objects.equals(employee, profit.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, price, count);
    }
}

package com.elyashevich.bookshop.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private long id;
    private Customer customer;
    private Employee employee;
    private List<Book> books = new ArrayList<>();
    private final LocalDateTime createdAt;

    public Order(long id, Customer customer, Employee employee, List<Book> books) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.books = books;
        this.createdAt = LocalDateTime.now();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(customer, order.customer) && Objects.equals(employee, order.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, employee);
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", employee=" + employee +
                ", \n\tbooks=" + books +
                ", createdAt=" + createdAt +
                "}\n";
    }
}

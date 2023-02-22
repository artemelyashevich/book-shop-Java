package com.elyashevich.bookshop.main;

import com.elyashevich.bookshop.action.*;
import com.elyashevich.bookshop.action.impl.BookServiceImpl;
import com.elyashevich.bookshop.action.impl.CustomerServiceImpl;
import com.elyashevich.bookshop.action.impl.EmployeeServiceImpl;
import com.elyashevich.bookshop.action.impl.OrderServiceImpl;
import com.elyashevich.bookshop.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //employees
    public static EmployeeService employeeService = new EmployeeServiceImpl();
    public static List<Employee> employees = employeeService.generate();

    //customers
    public static CustomerService customerService = new CustomerServiceImpl();
    public static List<Customer> customers = customerService.generate();

    //books
    public static BookService bookService = new BookServiceImpl();
    public static List<Book> books = bookService.generate();

    //orders
    public static OrderService orderService = new OrderServiceImpl();
    public static List<Order> orders = orderService.generate();


    public static void main(String[] args) {
        Information information = new Information();
        information.print();
    }

    //print short information
    public static void getInfoShop() {
        String info =
                String.format("The store sold - %d books\nThe cost of all books - %s$\n", getCountOfSoldBooks(), getPriceOfBooksInAllOrders());
        System.out.println(info);
    }

    //print profit information about employee
    public static void getInfoProfitEmployee(Employee employee) {
        String info = "";
        info =
                String.format("Employee: %s\n%s\n",
                        employee.getName(), getProfitByEmployee(employee));
        System.out.println(info);
    }

    //print profit information about each employee
    public static void getInfoProfitFromAllEmployee() {
        String info = "";
        for (Employee employee : employees) {
            info =
                    String.format("Employee: %s\n%s\n",
                            employee.getName(), getProfitByEmployee(employee));
            System.out.println(info);
        }
    }

    //get book by id
    public static Book GetBook(long id) {
        Book curr_book = null;
        for (Book book : books) {
            if (book.getId() == id) {
                curr_book = book;
                break;
            }
        }
        return curr_book;
    }

    //get count of all sold books
    public static int getCountOfSoldBooks() {
        int count = 0;
        for (Order order : orders) {
            count += order.getBooks().size();
        }
        return count;
    }

    //get price for books from one order
    public static float getPriceOfBooksInOrder(Order order) {
        float price = 0;
        for (Book book : order.getBooks()) {
            price += book.getPrice();
        }
        return price;
    }

    //get price for books all orders
    public static float getPriceOfBooksInAllOrders() {
        float price = 0;
        for (Order order : orders) {
            price += getPriceOfBooksInOrder(order);
        }
        return price;
    }

    //get number and price of books sold by one employee
    public static Profit getProfitByEmployee(Employee employee) {
        int count = 0;
        float price = 0;
        for (Order order : orders) {
            if (order.getEmployee() == employee) {
                count += 1;
                price += getPriceOfBooksInOrder(order);
            }
        }
        return new Profit(employee, price, count);
    }


    //get count and price books by genre
    public static BookAdditional getBookAdditional(BookGenre genre) {
        float price = 0;
        int count = 0;
        for (Book book : books) {
            if (book.getGenre() == genre) {
                price += book.getPrice();
                count += 1;
            }
        }
        return new BookAdditional(count, price);
    }

    //get count book by genre in order
    public static int getCountBookByGenre(Order order, BookGenre genre) {
        int count = 0;
        for (Book book : order.getBooks()) {
            if (book.getGenre() == genre) {
                count += 1;
            }
        }
        return count;
    }

    //get most popular genre by age (less)
    public static BookGenre getMostPopularGenreByAgeLess(int age) {
        List<Long> customersList = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getAge() < age) {
                customersList.add(customer.getId());
            }
        }

        int countArt = 0;
        int countProgramming = 0;

        for (Order order : orders) {
            if (customersList.contains(order.getCustomer().getId())) {
                countArt += getCountBookByGenre(order, BookGenre.Art);
                countProgramming += getCountBookByGenre(order, BookGenre.Programming);
            }
        }
        if (countArt > countProgramming) {
            return BookGenre.Art;
        }
        return BookGenre.Programming;
    }

    //get most popular genre by age (more)
    public static BookGenre getMostPopularGenreByAgeMore(int age) {
        List<Long> customersList = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getAge() > age) {
                customersList.add(customer.getId());
            }
        }

        int countArt = 0;
        int countProgramming = 0;

        for (Order order : orders) {
            if (customersList.contains(order.getCustomer().getId())) {
                countArt += getCountBookByGenre(order, BookGenre.Art);
                countProgramming += getCountBookByGenre(order, BookGenre.Programming);
            }
        }
        if (countArt > countProgramming) {
            return BookGenre.Art;
        }
        return BookGenre.Programming;
    }
}

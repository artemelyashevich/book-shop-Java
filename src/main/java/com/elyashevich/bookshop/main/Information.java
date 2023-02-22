package com.elyashevich.bookshop.main;

import com.elyashevich.bookshop.model.Employee;

import static com.elyashevich.bookshop.main.Main.employees;
import static com.elyashevich.bookshop.main.Main.getCountOfSoldBooks;
import static com.elyashevich.bookshop.main.Main.getMostPopularGenreByAgeLess;
import static com.elyashevich.bookshop.main.Main.getMostPopularGenreByAgeMore;
import static com.elyashevich.bookshop.main.Main.getPriceOfBooksInAllOrders;
import static com.elyashevich.bookshop.main.Main.getProfitByEmployee;

public class Information {
    private static void getInfoShop() {
        String info =
                String.format("The store sold - %d books\nThe cost of all books - %s$\n", getCountOfSoldBooks(), getPriceOfBooksInAllOrders());
        System.out.println(info);
    }

    //print profit information about employee
    private static void getInfoProfitEmployee(Employee employee) {
        String info = "";
        info =
                String.format("Employee: %s\n%s\n",
                        employee.getName(), getProfitByEmployee(employee));
        System.out.println(info);
    }

    //print profit information about each employee
    private static void getInfoProfitFromAllEmployee() {
        String info = "";
        for (Employee employee : employees) {
            info =
                    String.format("Employee: %s\n%s\n",
                            employee.getName(), getProfitByEmployee(employee));
            System.out.println(info);
        }
    }

    public static void print(){
        getInfoShop();
        getInfoProfitEmployee(employees.get(1));
        getPriceOfBooksInAllOrders();
        getInfoProfitFromAllEmployee();
        System.out.println(getMostPopularGenreByAgeLess(31));
        System.out.println(getMostPopularGenreByAgeMore(31));
    }
}

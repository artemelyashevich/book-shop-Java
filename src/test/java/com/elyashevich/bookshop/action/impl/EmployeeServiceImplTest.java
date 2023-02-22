package com.elyashevich.bookshop.action.impl;

import com.elyashevich.bookshop.action.EmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {

    static EmployeeService employeeService = new EmployeeServiceImpl();


    @Test
    void generate_positive() {
        int expectedSize = 3;
        int actualSize = employeeService.generate().size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void generate_negative() {
        int expectedSize = 5;
        int actualSize = employeeService.generate().size();
        assertNotEquals(expectedSize, actualSize);
    }

}
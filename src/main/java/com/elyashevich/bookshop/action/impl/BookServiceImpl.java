package com.elyashevich.bookshop.action.impl;

import com.elyashevich.bookshop.action.BookService;
import com.elyashevich.bookshop.model.Book;
import com.elyashevich.bookshop.model.BookGenre;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> generate() {
        List<Book> books = new ArrayList<>();
        //books (Art)
        books.add(new Book(1, "The Goldfinch", "Tartt Donna", 12.5f, BookGenre.Art));
        books.add(new Book(2, "Lust for Life", " Stone Irving", 15f, BookGenre.Art));
        books.add(new Book(3, "The Art Forger", "Shapiro Barbara A.", 10f, BookGenre.Art));
        //books (Programming)
        books.add(new Book(4, "Working Effectively with Legacy Code", "Michael Feathers", 11.25f, BookGenre.Programming));
        books.add(new Book(5, "The Clean Coder", "Martin", 8f, BookGenre.Programming));
        books.add(new Book(6, "Code Complete", "Steve Mcconnell", 18f, BookGenre.Programming));
        return books;
    }

}

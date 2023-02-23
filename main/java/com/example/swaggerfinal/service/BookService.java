package com.example.swaggerfinal.service;

import com.example.swaggerfinal.model.Book;

import java.util.List;

public interface BookService {

    public  String addBook(Book book);
    public Book getBookById(int id);
    public String update(Book book);
    public String removeBookFromList(int id);
    public List<Book> getAllBooks();
}

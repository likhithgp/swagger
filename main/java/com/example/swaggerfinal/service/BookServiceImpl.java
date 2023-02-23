package com.example.swaggerfinal.service;

import com.example.swaggerfinal.dao.BookRepo;
import com.example.swaggerfinal.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{


    @Autowired
    private BookRepo repo;

    @Override
    public String addBook(Book book) {
        repo.save(book);
        return "Added book to list sucessfully";
    }

    @Override
    public Book getBookById(int id) {

        return repo.findById(id).get();
    }

    @Override
    public String update(Book book) {
        return null;
    }

    @Override
    public String removeBookFromList(int id) {

        repo.deleteById(id);
        return "Removed from list";
    }

    @Override
    public List<Book> getAllBooks() {
        return (List<Book>) repo.findAll();
    }
}

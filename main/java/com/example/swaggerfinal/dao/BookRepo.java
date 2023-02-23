package com.example.swaggerfinal.dao;


import com.example.swaggerfinal.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<Book,Integer> {


}

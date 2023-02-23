package com.example.swaggerfinal.controller;


import com.example.swaggerfinal.model.Book;
import com.example.swaggerfinal.service.BookService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BookController {

      @Autowired
      private BookService service;

      @PostMapping("/book")
      @ApiOperation("To add new Book")
      @ApiResponses(value = {
              @ApiResponse(code = 200, message = "Book Successfully added to List"),
              @ApiResponse(code = 404, message = "Item not found")
      })
      ResponseEntity<?> addBook(@RequestBody Book book){
            return new ResponseEntity<>(service.addBook(book), HttpStatus.OK);
      }

      @GetMapping("/books")
      @ApiOperation("To List all the available books")
      ResponseEntity<?> getAllBook(){
            return new ResponseEntity<>(service.getAllBooks(), HttpStatus.OK);
      }

      @GetMapping("/book/{id}")
      @ApiOperation("To Get single book name by id")
      @ApiResponses(value = {
              @ApiResponse(code = 200, message = "Fetched Book Successfully from List",response = Book.class),
              @ApiResponse(code = 404, message = "Book not found")
      })
      ResponseEntity<?> getBook(@PathVariable int id){
            return new ResponseEntity<>(service.getBookById(id), HttpStatus.OK);
      }

      @DeleteMapping("/book/{id}")
      @ApiOperation("To remove book from list")
      ResponseEntity<?> removeBook(@PathVariable int id){
            return new ResponseEntity<>(service.removeBookFromList(id), HttpStatus.OK);
      }



}

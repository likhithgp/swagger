package com.example.swaggerfinal.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private int id;
    @ApiModelProperty(notes = "Name of the book", example = "Atomic Habits", required = true)
    String name;
    
}

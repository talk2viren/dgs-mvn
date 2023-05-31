package com.example.dgsmvn.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    String id;
    String name;
    String author;
    float Price;
//    Rating ratings[];
}

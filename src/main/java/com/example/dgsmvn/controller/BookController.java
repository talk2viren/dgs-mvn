package com.example.dgsmvn.controller;

import com.example.dgsmvn.domain.Book;
import com.example.dgsmvn.domain.Rating;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsEntityFetcher;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class BookController {

    private final List<Book> bookList = Arrays.asList(
            new Book("1", "Book Name -1", "Book Author -1", 21),
            new Book("2", "Book Name -2", "Book Author -2", 22),
            new Book("3", "Book Name -3", "Book Author -3", 23),
            new Book("4", "Book Name -4", "Book Author -4", 24)
    );

    @DgsQuery
    public List<Book> bookById(@InputArgument String id) {

        if (Optional.ofNullable(id).isEmpty()) {
            System.out.println("Inside if : "+id);
             return bookList;
        }
        return bookList.stream().filter(book -> book.getId().equals(id)).collect(Collectors.toList());
    }
}

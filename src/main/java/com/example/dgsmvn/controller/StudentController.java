package com.example.dgsmvn.controller;

import com.example.dgsmvn.domain.Student;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class StudentController {

    List<Student> studentList = Arrays.asList(
            new Student("1","sfirst 1","slast 1","city_1"),
            new Student("2","sfirst 2","slast 2","city_2"),
            new Student("3","sfirst 3","slast 3","city_3"),
            new Student("4","sfirst 4","slast 4","city_4"),
            new Student("5","sfirst 5","slast 5","city_4")
    );


    @DgsQuery
    public List<Student> students(){
        return studentList;
    }



    public List<Student> studentById(String id){

        if(Optional.ofNullable(id).isEmpty())
            return studentList;

        return studentList.stream().filter(student -> student.getId().equals(id)).collect(Collectors.toList());

    }



}

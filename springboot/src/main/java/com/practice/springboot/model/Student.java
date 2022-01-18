package com.practice.springboot.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.Collection;

@Document(collection = "students")
@Getter
@Setter
public class Student {
    @Id
    public String id;
    public String firstname;
    public String lastname;
    public int age;
    public String teacher;


}

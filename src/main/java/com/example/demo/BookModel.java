package com.example.demo;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookModel {
    private int id;
    private String name;
    private String Isbn;
}

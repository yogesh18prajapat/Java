package com.company;

import java.util.List;

public class Library{
    public List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks(){
        return  books;
    }

}

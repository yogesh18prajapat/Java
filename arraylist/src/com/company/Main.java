package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Book book = new Book(01,"name1","author1","publications1",1);
        book.addBook(02,"name2","author2","publications2",2);
        book.addBook(025,"name3","author3","publications3",3);
        book.addBook(036,"name4","author4","publications4",4);
        book.addBook(05,"name5","author5","publications5",5);
        book.addBook(06,"name6","author6","publications6",6);



        ArrayList<Book> books = book.getLibrary();
        for (Book i : books){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        books.add(book.createBook(10,"added","added","added",10));
        books.remove(3);
        for (Book i : books){
            System.out.println(i);
        }

        System.out.println("Using forEach()");
        books.forEach((book1) -> System.out.println(book1.getAuthor()));

    }
}

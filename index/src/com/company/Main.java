package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        Book book = new Book("book",10.021);

        ArrayList<Book> library = new ArrayList<>();
        library.add(book);
        library.add(book.newBook("book1",12.025));
        library.add(book.newBook("book2",14.025));
        library.add(book.newBook("book3",15.025));
        library.add(book.newBook("book4",17.025));

        for(Book bk : library){
            System.out.println(bk);
        }


//        Iterator<Book> value = library.iterator();
//            System.out.println(value.next());


    }
}

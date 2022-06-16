package com.company;

import java.util.ArrayList;

public class Book implements  Comparable<Book> {
    private int id;
    private String name, author, publications;
    private int quantity;
    private ArrayList<Book> library;

    public Book(int id, String name, String author, String publications, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publications = publications;
        this.quantity = quantity;
        this.library = new ArrayList<>();
    }
    public int getId(){
        return id;
    }
    public int getQuantity(){
        return  quantity;
    }
    public String getName(){
        return  name;
    }
    public  String getAuthor(){
        return  author;
    }
    public String getPublications(){
        return  publications;
    }

    public void addBook(int id, String name, String author, String publications, int quantity){
        library.add(new Book(id,name,author,publications,quantity));
    }
    public Book createBook(int id, String name, String author, String publications, int quantity){
        return  new Book(id,name,author,publications,quantity);
    }

    public ArrayList<Book> getLibrary(){
        return library;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publications='" + publications + '\'' +
                ", quantity=" + quantity + " }";
    }

    public int compareTo(Book book){
        if(this.id > book.getId()){
            return 1;
        }else if(this.id < book.getId()){
            return  -1;
        }else{
            return  0;
        }
    }

}

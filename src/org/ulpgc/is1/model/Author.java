package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Author {
    public String name;
    public String surname;
    private ArrayList<Book> books;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public int bookCount(){
        return books.size();
    }

    public Book getBook(int index){
        return books.get(index);
    }

}
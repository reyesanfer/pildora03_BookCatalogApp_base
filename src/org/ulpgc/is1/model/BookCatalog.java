package org.ulpgc.is1.model;

import java.util.ArrayList;

public class BookCatalog {

    private final ArrayList<Book> bookList;
    private final ArrayList<Author> authorList;

    public BookCatalog(){
        bookList = new ArrayList();
        authorList = new ArrayList();
    }

}
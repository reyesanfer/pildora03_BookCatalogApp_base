package org.ulpgc.is1.model;

import java.util.ArrayList;

public class BookCatalog {

    private final ArrayList<Book> bookList;
    private final ArrayList<Author> authorList;

    public BookCatalog() {
        bookList = new ArrayList<>();
        authorList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void addBook(String title, String editor, int year, Subject subject, Author author) {
        Book newBook = new Book(title, editor, year, subject, author);
        bookList.add(newBook);
    }

    public Book getBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            return bookList.get(index);
        }
        return null;
    }

    public void removeBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
        }
    }

    public int bookCount() {
        return bookList.size();
    }

    public void addAuthor(String name, String surname) {
        Author newAuthor = new Author(name, surname);
        authorList.add(newAuthor);
    }

    public Author getAuthor(int index) {
        if (index >= 0 && index < authorList.size()) {
            return authorList.get(index);
        }
        return null;
    }

    public void removeAuthor(int index) {
        if (index >= 0 && index < authorList.size()) {
            authorList.remove(index);
        }
    }

    public int authorCount() {
        return authorList.size();
    }
}
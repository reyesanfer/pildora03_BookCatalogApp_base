package org.ulpgc.is1.model;

public class Book {
    private static int nextID = 0;
    public final int id;
    public String title;
    public String editor;
    public int year;
    public Subject subject;
    public Author author;

    public Book(String title, String editor, int year, Subject subject, Author author) {
        this.id = nextID++;
        this.title = title;
        this.editor = editor;
        this.year = year;
        this.subject = subject;
        this.author = author;
        author.addBook(this);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Author getAuthor() {
        return author;
    }
}
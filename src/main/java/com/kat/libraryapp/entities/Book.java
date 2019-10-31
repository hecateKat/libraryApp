package com.kat.libraryapp.entities;

import java.util.HashSet;
import java.util.Set;

public class Book {

    private String title;
    private String lsbn;
    private String publisher;
    private Set<Author> authors = new HashSet<>();

    public Book(String title, String lsbn, String publisher) {
        this.title = title;
        this.lsbn = lsbn;
        this.publisher = publisher;
    }

    public Book(String title, String lsbn, String publisher, Set<Author> authors) {
        this.title = title;
        this.lsbn = lsbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLsbn() {
        return lsbn;
    }

    public void setLsbn(String lsbn) {
        this.lsbn = lsbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}

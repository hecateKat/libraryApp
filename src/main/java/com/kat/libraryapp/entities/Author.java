package com.kat.libraryapp.entities;

import java.util.HashSet;
import java.util.Set;

public class Author {

    private String name;
    private String surname;
    private Set<Book> books = new HashSet<>();

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author(String name, String surname, Set<Book> books) {
        this.name = name;
        this.surname = surname;
        this.books = books;
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

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
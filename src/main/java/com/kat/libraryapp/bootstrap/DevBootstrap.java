package com.kat.libraryapp.bootstrap;

import com.kat.libraryapp.entities.Author;
import com.kat.libraryapp.entities.Book;
import com.kat.libraryapp.entities.Publisher;
import com.kat.libraryapp.repositories.AuthorRepository;
import com.kat.libraryapp.repositories.BookRepository;
import com.kat.libraryapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("IT publisher");

        publisherRepository.save(publisher);

        Author author1 = new Author("Eric", "Evans");
        Book book1 = new Book("Domain Driven Design", "1234", publisher);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("Rod", " Johnson");
        Book book2 = new Book("J2EE Developement", "234455", publisher);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(book2);
    }

}

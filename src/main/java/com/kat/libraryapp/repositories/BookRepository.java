package com.kat.libraryapp.repositories;

import com.kat.libraryapp.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

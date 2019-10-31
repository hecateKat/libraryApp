package com.kat.libraryapp.repositories;

import com.kat.libraryapp.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

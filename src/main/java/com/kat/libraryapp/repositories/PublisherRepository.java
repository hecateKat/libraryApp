package com.kat.libraryapp.repositories;

import com.kat.libraryapp.entities.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

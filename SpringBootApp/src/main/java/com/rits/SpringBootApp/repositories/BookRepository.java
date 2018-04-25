package com.rits.SpringBootApp.repositories;

import com.rits.SpringBootApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

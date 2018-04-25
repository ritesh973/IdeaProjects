package com.rits.SpringBootApp.repositories;

import com.rits.SpringBootApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

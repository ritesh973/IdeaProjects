package com.rits.SpringBootApp.repositories;

import com.rits.SpringBootApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}

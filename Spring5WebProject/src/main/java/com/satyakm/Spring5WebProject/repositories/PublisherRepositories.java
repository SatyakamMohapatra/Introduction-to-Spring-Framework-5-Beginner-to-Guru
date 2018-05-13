package com.satyakm.Spring5WebProject.repositories;

import com.satyakm.Spring5WebProject.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositories extends CrudRepository<Publisher,Long> {
}

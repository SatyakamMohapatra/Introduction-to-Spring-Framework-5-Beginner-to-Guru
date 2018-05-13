package com.satyakm.Spring5WebProject.repositories;

import com.satyakm.Spring5WebProject.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author,Long> {
}

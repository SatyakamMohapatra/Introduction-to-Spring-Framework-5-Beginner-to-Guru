package com.satyakm.Spring5WebProject.repositories;

import com.satyakm.Spring5WebProject.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book,Long> {
}

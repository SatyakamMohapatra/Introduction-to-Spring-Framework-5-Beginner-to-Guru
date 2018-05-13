package com.satyakm.Spring5WebProject.bootstrap;

import com.satyakm.Spring5WebProject.model.Author;
import com.satyakm.Spring5WebProject.model.Book;
import com.satyakm.Spring5WebProject.model.Publisher;
import com.satyakm.Spring5WebProject.repositories.AuthorRepositories;
import com.satyakm.Spring5WebProject.repositories.BookRepositories;
import com.satyakm.Spring5WebProject.repositories.PublisherRepositories;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Satyakam
 * @
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepositories authorRepositories;
    private BookRepositories bookRepositories;
    private PublisherRepositories publisherRepositories;

    public DevBootstrap(AuthorRepositories authorRepositories, BookRepositories bookRepositories, PublisherRepositories publisherRepositories) {
        this.authorRepositories = authorRepositories;
        this.bookRepositories = bookRepositories;
        this.publisherRepositories = publisherRepositories;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){
        Author satya = new Author("Satyakam","Mohapatra");
        Publisher works = new Publisher("works","New York");
        Book ddd = new Book("Data Driven Design","1234",works);
        satya.getBooks().add(ddd);
        ddd.getAuthors().add(satya);
        authorRepositories.save(satya);
        publisherRepositories.save(works);
        bookRepositories.save(ddd);

        Author nutan = new Author("Nutan","Das");
        Publisher zed = new Publisher("zed","LA");
        Book lpthw = new Book("Learn Python The Hard way","3456",zed);
        nutan.getBooks().add(lpthw);
        lpthw.getAuthors().add(nutan);
        authorRepositories.save(nutan);
        publisherRepositories.save(zed);
        bookRepositories.save(lpthw);
    }
}

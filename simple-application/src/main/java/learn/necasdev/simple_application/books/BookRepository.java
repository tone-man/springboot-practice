package learn.necasdev.simple_application.books;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * Basic persistance accessor, (repository)
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
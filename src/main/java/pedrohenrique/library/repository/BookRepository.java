package pedrohenrique.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedrohenrique.library.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {





}

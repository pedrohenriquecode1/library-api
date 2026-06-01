package pedrohenrique.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedrohenrique.library.model.Library;

import java.util.Optional;
@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {





}

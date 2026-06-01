package pedrohenrique.library.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pedrohenrique.library.model.Library;
import pedrohenrique.library.repository.LibraryRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public List<Library> findAll(){
        return libraryRepository.findAll();
    }
    public Optional<Library> getById(Long id){
        return libraryRepository.findById(id);
    }
    public Library save(Library library){
        return libraryRepository.save(library);
    }
    public void delete(Long id){
        libraryRepository.deleteById(id);
    }
}

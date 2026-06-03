package pedrohenrique.library.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pedrohenrique.library.model.Book;
import pedrohenrique.library.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    public Book getById(Long id){
        return bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Livro não encontrado"));

    }

    public Book save(Book book){
        return bookRepository.save(book);
    }
    public Book update(Long id, Book book){
        Book bookToBeUpdated = this.bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("livro não existente"));
        bookToBeUpdated.setTitle(book.getTitle());
        bookToBeUpdated.setAuthor(book.getAuthor());
        bookToBeUpdated.setGenre(book.getGenre());
        bookToBeUpdated.setPublishedAt(book.getPublishedAt());
        return bookRepository.save(bookToBeUpdated);
//
    }
    public void delete(Long id){
        if (!bookRepository.existsById(id)){
            throw new EntityNotFoundException("livro não existente ");
        }
        bookRepository.deleteById(id);
    }
}

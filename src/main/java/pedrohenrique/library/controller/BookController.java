package pedrohenrique.library.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pedrohenrique.library.model.Book;
import pedrohenrique.library.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/library")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book>getAll(){
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id){
        return bookService.getById(id);
    }

    @PostMapping
    public Book save(@RequestBody Book book){
        return bookService.save(book);

    }

    @PutMapping("/{id}")
    public Book  update(@PathVariable Long id,@RequestBody Book book){
        return bookService.update(id, book);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }
}


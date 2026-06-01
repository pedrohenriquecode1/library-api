package pedrohenrique.library.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pedrohenrique.library.model.Library;
import pedrohenrique.library.service.LibraryService;

import java.util.List;

@RestController
@RequestMapping("/library")
@RequiredArgsConstructor
public class LibraryController {

    private final LibraryService libraryService;

    @GetMapping
    public List<Library>getAll(){
        return libraryService.findAll();
    }
    @GetMapping
    public Library getById
    }


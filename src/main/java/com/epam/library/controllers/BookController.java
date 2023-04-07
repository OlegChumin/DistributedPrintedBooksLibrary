package com.epam.library.controllers;

import com.epam.library.models.entities.Book;
import com.epam.library.models.entities.dto.BookDTO;
import com.epam.library.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody BookDTO bookDTO) {
        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        Book addedBook = bookService.addBook(book);
        return ResponseEntity.ok().body(addedBook);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok().body(book);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok().body(books);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return ResponseEntity.noContent().build();
    }
}

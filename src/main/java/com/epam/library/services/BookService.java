package com.epam.library.services;

import com.epam.library.models.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void deleteById(Long id);

    Book addBook(Book book);

    Book getBookById(Long id);

    List<Book> getAllBooks();

    void deleteBookById(Long id);
}

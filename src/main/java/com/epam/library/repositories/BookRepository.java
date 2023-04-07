// src/main/java/com/example/distributedlibrary/repository/BookRepository.java

package com.epam.library.repositories;

import com.epam.library.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

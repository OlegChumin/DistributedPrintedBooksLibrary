package com.epam.library.models.entities.dto;

/**
 * A DTO (Data Transfer Object) is a design pattern used in software engineering to transfer data between systems or
 * subsystems in a structured way. It is typically used to transfer data between a client and server or between
 * different layers of an application. DTOs are used to encapsulate data in a way that is independent of the underlying
 * ata storage technology and to reduce the amount of data that needs to be transmitted over the network. They often
 * contain only the data required for a specific use case or task, rather than the entire object graph.
 * */

public class BookDTO {
    private Long id;
    private String title;
    private String author;

    public BookDTO() {
    }

    public BookDTO(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

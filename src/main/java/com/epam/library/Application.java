package com.epam.library;

import com.epam.library.repositories.DatabaseInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        DatabaseInitializer initializer = context.getBean(DatabaseInitializer.class);
        try {
            initializer.initialize();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
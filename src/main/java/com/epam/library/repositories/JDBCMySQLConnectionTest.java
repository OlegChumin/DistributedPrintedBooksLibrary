package com.epam.library.repositories;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class JDBCMySQLConnectionTest {
    
    private final String url = "jdbc:mysql://localhost:3306/test";
    private final String user = "root";
    private final String password = "password";
    
    @PostConstruct
    public void testConnection() {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}

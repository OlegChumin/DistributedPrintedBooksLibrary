package com.epam.library;

import com.epam.library.repositories.JDBCMySQLConnectionTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

    @Autowired
    private JDBCMySQLConnectionTest jdbcMySQLConnectionTest;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TestApplication.class, args);
        JDBCMySQLConnectionTest test = context.getBean(JDBCMySQLConnectionTest.class);
        test.testConnection();
    }

    @Bean
    public JDBCMySQLConnectionTest jdbcMySQLConnectionTest() {
        return new JDBCMySQLConnectionTest();
    }
}

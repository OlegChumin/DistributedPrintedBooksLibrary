// src/main/java/com/example/distributedlibrary/repository/UserRepository.java

package com.epam.library.repositories;

import com.epam.library.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

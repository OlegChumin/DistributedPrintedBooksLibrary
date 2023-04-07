// src/main/java/com/example/distributedlibrary/repository/LibraryOwnerRepository.java

package com.epam.library.repositories;

import com.epam.library.models.entities.LibraryOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryOwnerRepository extends JpaRepository<LibraryOwner, Long> {
}

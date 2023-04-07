package com.epam.library.services;

import com.epam.library.models.entities.LibraryOwner;

import java.util.List;

public interface LibraryOwnerService {
    List<LibraryOwner> findAll();
    LibraryOwner findById(Long id);
    LibraryOwner save(LibraryOwner libraryOwner);
    void deleteById(Long id);

    LibraryOwner addLibraryOwner(LibraryOwner libraryOwner);

    LibraryOwner getLibraryOwnerById(Long id);

    LibraryOwner updateLibraryOwner(Long id, LibraryOwner libraryOwner);

    void deleteLibraryOwner(Long id);

    List<LibraryOwner> getAllLibraryOwners();

    void deleteLibraryOwnerById(Long id);
}

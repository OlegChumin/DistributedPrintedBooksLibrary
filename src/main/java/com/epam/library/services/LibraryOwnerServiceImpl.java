package com.epam.library.services;

import com.epam.library.models.entities.LibraryOwner;
import com.epam.library.repositories.LibraryOwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryOwnerServiceImpl implements LibraryOwnerService {

    private final LibraryOwnerRepository libraryOwnerRepository;

    public LibraryOwnerServiceImpl(LibraryOwnerRepository libraryOwnerRepository) {
        this.libraryOwnerRepository = libraryOwnerRepository;
    }

    @Override
    public List<LibraryOwner> findAll() {
        return libraryOwnerRepository.findAll();
    }

    @Override
    public LibraryOwner findById(Long id) {
        return libraryOwnerRepository.findById(id).orElse(null);
    }

    @Override
    public LibraryOwner save(LibraryOwner libraryOwner) {
        return libraryOwnerRepository.save(libraryOwner);
    }

    @Override
    public void deleteById(Long id) {
        libraryOwnerRepository.deleteById(id);
    }

    @Override
    public LibraryOwner addLibraryOwner(LibraryOwner libraryOwner) {
        return libraryOwnerRepository.save(libraryOwner);
    }

    @Override
    public LibraryOwner getLibraryOwnerById(Long id) {
        return libraryOwnerRepository.findById(id).orElse(null);
    }

    @Override
    public LibraryOwner updateLibraryOwner(Long id, LibraryOwner libraryOwner) {
        LibraryOwner existingLibraryOwner = libraryOwnerRepository.findById(id).orElse(null);

        if (existingLibraryOwner != null) {
            existingLibraryOwner.setName(libraryOwner.getName());
            existingLibraryOwner.setAddress(libraryOwner.getAddress());
            existingLibraryOwner.setPhoneNumber(libraryOwner.getPhoneNumber());
            return libraryOwnerRepository.save(existingLibraryOwner);
        }

        return null;
    }

    @Override
    public void deleteLibraryOwner(Long id) {
        libraryOwnerRepository.deleteById(id);
    }

    @Override
    public List<LibraryOwner> getAllLibraryOwners() {
        return libraryOwnerRepository.findAll();
    }

    @Override
    public void deleteLibraryOwnerById(Long id) {
        libraryOwnerRepository.deleteById(id);
    }
}

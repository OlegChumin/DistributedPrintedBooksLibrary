package com.epam.library.controllers;

import com.epam.library.models.entities.LibraryOwner;
import com.epam.library.models.entities.dto.LibraryOwnerDto;
import com.epam.library.services.LibraryOwnerService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/library-owners")
public class LibraryOwnerController {

    private final LibraryOwnerService libraryOwnerService;

    public LibraryOwnerController(LibraryOwnerService libraryOwnerService) {
        this.libraryOwnerService = libraryOwnerService;
    }

    @PostMapping
    public ResponseEntity<LibraryOwnerDto> addLibraryOwner(@RequestBody LibraryOwnerDto libraryOwnerDto) {
        LibraryOwner libraryOwner = new LibraryOwner();
        BeanUtils.copyProperties(libraryOwnerDto, libraryOwner);
        LibraryOwner addedLibraryOwner = libraryOwnerService.addLibraryOwner(libraryOwner);
        LibraryOwnerDto addedLibraryOwnerDto = new LibraryOwnerDto();
        BeanUtils.copyProperties(addedLibraryOwner, addedLibraryOwnerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedLibraryOwnerDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibraryOwnerDto> getLibraryOwnerById(@PathVariable Long id) {
        LibraryOwner libraryOwner = libraryOwnerService.getLibraryOwnerById(id);
        LibraryOwnerDto libraryOwnerDto = new LibraryOwnerDto();
        BeanUtils.copyProperties(libraryOwner, libraryOwnerDto);
        return ResponseEntity.ok().body(libraryOwnerDto);
    }

    @GetMapping
    public ResponseEntity<List<LibraryOwnerDto>> getAllLibraryOwners() {
        List<LibraryOwner> libraryOwners = libraryOwnerService.getAllLibraryOwners();
        List<LibraryOwnerDto> libraryOwnerDtos = new ArrayList<>();
        for (LibraryOwner libraryOwner : libraryOwners) {
            LibraryOwnerDto libraryOwnerDto = new LibraryOwnerDto();
            BeanUtils.copyProperties(libraryOwner, libraryOwnerDto);
            libraryOwnerDtos.add(libraryOwnerDto);
        }
        return ResponseEntity.ok().body(libraryOwnerDtos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LibraryOwnerDto> updateLibraryOwner(@PathVariable Long id, @RequestBody LibraryOwnerDto libraryOwnerDto) {
        LibraryOwner libraryOwner = new LibraryOwner();
        BeanUtils.copyProperties(libraryOwnerDto, libraryOwner);
        LibraryOwner updatedLibraryOwner = libraryOwnerService.updateLibraryOwner(id, libraryOwner);
        LibraryOwnerDto updatedLibraryOwnerDto = new LibraryOwnerDto();
        BeanUtils.copyProperties(updatedLibraryOwner, updatedLibraryOwnerDto);
        return ResponseEntity.ok().body(updatedLibraryOwnerDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibraryOwnerById(@PathVariable Long id) {
        libraryOwnerService.deleteLibraryOwnerById(id);
        return ResponseEntity.noContent().build();
    }

}

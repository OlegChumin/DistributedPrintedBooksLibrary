package com.epam.library.controllers;

@RestController
@RequestMapping("/api/library-owners")
public class LibraryOwnerController {

    private final LibraryOwnerService libraryOwnerService;

    public LibraryOwnerController(LibraryOwnerService libraryOwnerService) {
        this.libraryOwnerService = libraryOwnerService;
    }

    @PostMapping
    public LibraryOwner addLibraryOwner(@RequestBody LibraryOwner libraryOwner) {
        return libraryOwnerService.addLibraryOwner(libraryOwner);
    }

    @GetMapping("/{id}")
    public LibraryOwner getLibraryOwnerById(@PathVariable Long id) {
        return libraryOwnerService.getLibraryOwnerById(id);
    }

    @PutMapping("/{id}")
    public LibraryOwner updateLibraryOwner(@PathVariable Long id, @RequestBody LibraryOwner libraryOwner) {
        return libraryOwnerService.updateLibraryOwner(id, libraryOwner);
    }

    @DeleteMapping("/{id}")
    public void deleteLibraryOwner(@PathVariable Long id) {
        libraryOwnerService.deleteLibraryOwner(id);
    }

    @GetMapping
    public List<LibraryOwner> getAllLibraryOwners() {
        return libraryOwnerService.getAllLibraryOwners();
    }

}

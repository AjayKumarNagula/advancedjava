package com.practice.librarymanagement.controller;


import com.practice.librarymanagement.model.Library;
import com.practice.librarymanagement.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/manage")
public class LibraryController {
@Autowired
   private LibraryService libraryService;
@PostMapping("/newbook")
    public Library addNewBook(@RequestBody Library library) {
        return this.libraryService.addNewBook(library);
    }
@GetMapping("/all")
    public List<Library> getAllBooks(){
        return this.libraryService.getAllBooks();
    }
@DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id) {
        return this.libraryService.deleteBook(id);
    }
@PutMapping("/update/{id}")
    public Library updateBook(@PathVariable Integer id, @RequestBody Library updatedBook){
    return this.libraryService.updateBook(id,updatedBook);
    }
@GetMapping("/{id}")
    public Optional<Library> getSingleBook(@PathVariable Integer id, @RequestBody Library library){
        return this.libraryService.getSingleBook(id,library);
    }
@PatchMapping("/specific/{id}")
    public Library updateSpecificData(@PathVariable Integer id, @RequestParam Double bookPrice){
    return this.libraryService.updateSpecificData(id, bookPrice);
    }

}

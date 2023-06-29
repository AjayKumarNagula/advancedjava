package com.practice.librarymanagement.service;


import com.practice.librarymanagement.model.Library;
import com.practice.librarymanagement.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;


    public Library addNewBook(Library library) {
        this.libraryRepository.save(library);
        return library;
    }

    public List<Library> getAllBooks(){
        return this.libraryRepository.findAll();
    }

    public String deleteBook(Integer id){
        this.libraryRepository.deleteById(id);
        return "deleted the book  "  +id;
    }

    public Library updateBook(Integer id,Library updatedBook) {
        Library oldBook = this.libraryRepository.findById(id).get();

        oldBook.setBookAuthor(updatedBook.getBookAuthor());
        oldBook.setBookName(updatedBook.getBookName());
        oldBook.setBookPrice(updatedBook.getBookPrice());

        this.libraryRepository.save(oldBook);
        return updatedBook;

    }

    public Optional<Library> getSingleBook(Integer id, Library library){
        return this.libraryRepository.findById(id);
    }

    public Library updateSpecificData(Integer id, Double bookPrice){
        Library oldBook = this.libraryRepository.findById(id).get();

        oldBook.setBookPrice(bookPrice);
        this.libraryRepository.save(oldBook);

        return oldBook;


    }


}
package com.practice.librarymanagement.repository;

import com.practice.librarymanagement.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LibraryRepository extends JpaRepository<Library, Integer>{

}

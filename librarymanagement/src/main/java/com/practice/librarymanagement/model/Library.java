package com.practice.librarymanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Library {

    @Id
    private int bookId;

   public String bookName;
   public String bookAuthor;
   public Double bookPrice;
}

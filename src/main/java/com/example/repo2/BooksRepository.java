package com.example.repo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model2.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {

}

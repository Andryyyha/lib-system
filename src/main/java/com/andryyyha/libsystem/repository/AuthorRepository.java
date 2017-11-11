package com.andryyyha.libsystem.repository;

import com.andryyyha.libsystem.model.Author;
import com.andryyyha.libsystem.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    @Query
    List<Book> getAll();
}

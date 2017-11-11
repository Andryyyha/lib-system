package com.andryyyha.libsystem.repository;

import com.andryyyha.libsystem.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {


}

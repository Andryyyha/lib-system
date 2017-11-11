package com.andryyyha.libsystem.repository;

import com.andryyyha.libsystem.model.BookExample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookExampleRepository extends CrudRepository<BookExample, Long> {
}

package com.andryyyha.libsystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AUTHOR")
public class Author {

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue
    private long id;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;

    public Author()
    {

    }

    public Author(String name, long id, List<Book> books)
    {
        this.name = name;
        this.id = id;
        this.books = books;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", books=" + books +
                '}';
    }
}

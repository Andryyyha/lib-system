package com.andryyyha.libsystem.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "title")
    private String title;

    @ManyToMany
    @JoinTable(name = "BOOK_AUTHOR", joinColumns = {@JoinColumn(name = "id_book")}, inverseJoinColumns = {@JoinColumn(name = "id_author")})
    private List<Author> authors;


    @OneToMany
    @JoinColumn(name = "id_book")
    private List<BookExample> copies;

    public Book() {
    }

    public Book(String title, long id, List<Author> authors) {
        this.title = title;
        this.id = id;
        this.authors = authors;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }
}
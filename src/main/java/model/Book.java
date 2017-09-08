package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue
    @OneToOne
    @JoinColumn(name = "id_book")
    private long id;

    private String title;
    private List<Author> authors;

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
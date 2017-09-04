package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AUTHOR")
public class Author {

    private String name;

    @Id
    @Column(name = "id", nullable = false, length = 255)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_author")
    private long id;
    @ManyToOne
    @JoinColumn
    private List<Book> booksByAuthor;

    public Author()
    {

    }

    public Author(String name, long id, List<Book> booksByAuthor)
    {
        this.name = name;
        this.id = id;
        this.booksByAuthor = booksByAuthor;
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

    public List<Book> getBooksByAuthor() {
        return booksByAuthor;
    }

    public void setBooksByAuthor(List<Book> booksByAuthor) {
        this.booksByAuthor = booksByAuthor;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", booksByAuthor=" + booksByAuthor +
                '}';
    }
}

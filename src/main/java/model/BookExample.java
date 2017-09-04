package model;

import model.Author;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "BOOK_EXAMPLE")
public class BookExample {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private int yearOfPublishment;
    private int pages;
    private String publisher;
    @OneToOne
    @JoinColumn(name = "book_id")
    private long id_book;

    public BookExample()
    {

    }

    public BookExample(long id, String title, ArrayList<Author> Authors, int yearOfPublishment, int pages, String publisher, long id_book)
    {
        this.id = id;
        this.title = title;
        this.yearOfPublishment = yearOfPublishment;
        this.pages = pages;
        this.publisher = publisher;
        this.id_book = id_book;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYearOfPublishment()
    {
        return yearOfPublishment;
    }

    public void setYearOfPublishment(int yearOfPublishment)
    {
        this.yearOfPublishment = yearOfPublishment;
    }

    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @OneToOne
    @JoinColumn(name = "id_book", referencedColumnName = "id")
    public long getId_book() {
        return id_book;
    }

    public void setId_book(long id_book) {
        this.id_book = id_book;
    }

    @Override
    public String toString() {
        return "BookExample{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearOfPublishment=" + yearOfPublishment +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", id_book=" + id_book +
                '}';
    }
}
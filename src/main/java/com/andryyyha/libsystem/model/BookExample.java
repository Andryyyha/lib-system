package com.andryyyha.libsystem.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "BOOK_EXAMPLE")
public class BookExample implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    private int yearOfPublishment;

    private int pages;

    private String publisher;

    private long bookId;


    public BookExample()
    {

    }

    public BookExample(long id, String title, ArrayList<Author> Authors, int yearOfPublishment, int pages, String publisher, long bookId)
    {
        this.id = id;
        this.title = title;
        this.yearOfPublishment = yearOfPublishment;
        this.pages = pages;
        this.publisher = publisher;
        this.bookId = bookId;
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

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "BookExample{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearOfPublishment=" + yearOfPublishment +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", id_book=" + bookId +
                '}';
    }
}
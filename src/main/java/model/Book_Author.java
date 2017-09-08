package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_AUTHOR")
public class Book_Author {
    private long bookId;
    private long authorId;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book_Author{" +
                "bookId=" + bookId +
                ", authorId=" + authorId +
                '}';
    }
}
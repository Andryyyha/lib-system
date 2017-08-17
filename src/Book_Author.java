
public class Book_Author {
    private long id_book;
    private long id_author;

    public Book_Author() {
    }

    public Book_Author(long id_book, long id_author) {
        this.id_book = id_book;
        this.id_author = id_author;
    }

    public long getId_author() {
        return id_author;
    }

    public long getId_book() {
        return id_book;
    }

    public void setId_author(long id_author) {
        this.id_author = id_author;
    }

    public void setId_book(long id_book) {
        this.id_book = id_book;
    }
}


/**
 * Created by Andrey on 12.08.2017.
 */
import java.util.ArrayList;

public class BookExample {
    private long id;
    private String title;
    private int yearOfPublishment;
    private int pages;
    private String publisher;

    public BookExample()
    {

    }

    public BookExample(long id, String title, ArrayList<Author> Authors, int yearOfPublishment, int pages, String publisher)
    {
        this.id = id;
        this.title = title;
        this.yearOfPublishment = yearOfPublishment;
        this.pages = pages;
        this.publisher = publisher;
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
}

/**
 * Created by Andrey on 12.08.2017.
 */
import java.util.ArrayList;

public class BookExample {
    private long id;
    private String title;
    private ArrayList<Author> Authors = new ArrayList<Author>();//Е Б А Н И Н А
    private int yearOfPublishment;
    private int pages;

    public BookExample()
    {

    }

    public BookExample(long id, String title, ArrayList<Author> Authors, int yearOfPublishment, int pages)
    {
        this.id = id;
        this.title = title;
        this.Authors = Authors;
        this.yearOfPublishment = yearOfPublishment;
        this.pages = pages;
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

    public ArrayList<Author> getAuthors()
    {
        return Authors;
    }

    public void setAuthors(ArrayList<Author> Authors)
    {
        this.Authors = Authors;
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
}

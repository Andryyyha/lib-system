/**
 * Created by Andrey on 12.08.2017.
 */

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Book {
    private long id;
    private String title;
    private int pages;
    private ArrayList<String> Authors = new ArrayList<String>(); //вот тута я включил аутиста и хз правильно ли это

    public Book()
    {

    }

    public Book(long id, String title, int pages, ArrayList<String> Authros)
    {
       this.id = id;
       this.title = title;
       this.pages = pages;
       this.Authors = Authros;
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

    public int getPages()
    {
        return pages;
    }

    public void  setPages(int pages)
    {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors()//после этого вообще дичь
    {
        return Authors;
    }

    public void setAuthors(ArrayList<String> Authors)
    {
        this.Authors = Authors;
    }
}

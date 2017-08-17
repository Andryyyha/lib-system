/**
 * Created by Andrey on 12.08.2017.
 */

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Book {
    private long id;
    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(long id) {
        this.id = id;
    }

    public Book(String title, long id) {
        this.title = title;
        this.id = id;
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
}

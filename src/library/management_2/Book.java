package library.management_2;

import java.util.Arrays;
import java.util.List;

public class Book {
    private final String title, author;
    private final int year;

    Book(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;

    }
    public List<Object> getBook(){
        return Arrays.asList(title, author, year);
    }

    public String getBookName(){
        return title;
    }
}

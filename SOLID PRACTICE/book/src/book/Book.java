package book;

import java.util.List;
import java.util.ListIterator;

public class Book {
    private String title;
    private List<String> pages;

    public Book(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
    }

    public List<String> getPages() {
        return pages;
    }

    public ListIterator<String> getPagesIterator() {
        return pages.listIterator();
    }

    public String getTitle() {
        return title;
    }
}

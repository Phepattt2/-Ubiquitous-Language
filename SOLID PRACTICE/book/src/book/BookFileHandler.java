package book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ListIterator;

public class BookFileHandler {
    private Book book;
    private ListIterator<String> iterator;
    private String currentPage;

    public BookFileHandler(Book book){
        this.book = book;
        iterator = book.getPagesIterator();
        if (iterator.hasNext()) {
            currentPage = iterator.next();
        } else {
            currentPage = null;
        }
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public boolean turnToNextPage() {
        if (iterator.hasNext()) {
            currentPage = iterator.next();
            return true;
        } else {
            return false;
        }
    }

    public void printToScreen() {
        // Book book = this;
        do {
            System.out.println(getCurrentPage());
        } while (turnToNextPage());
    }

    public void printToFile() {
        // Book book = this;
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(book.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, getCurrentPage());
                    isEven = true;
                }
            } while (turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }
}

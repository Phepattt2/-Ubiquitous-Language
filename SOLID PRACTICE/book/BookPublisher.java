package book;

public class BookPublisher implements BookFilePrinter {

    private BookFileHandler bookFileHandler;
    public BookPublisher(BookFileHandler bookFileHandler) {
        this.bookFileHandler = bookFileHandler;
    }

    @Override
    public void printToFile() {
        // TODO Auto-generated method stub
        bookFileHandler.printToFile();
    }

    // public static void main(String[] args) {
    //     Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
    //     // book.printToFile();
    //
    // }
}

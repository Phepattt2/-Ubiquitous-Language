/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

import java.util.List;

/**
 *
 * @author peera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
                
                BookFileHandler bookFileHandler = new BookFileHandler(book);

                BookReader bookReader = new BookReader(bookFileHandler);
                bookReader.printToScreen();

                BookPublisher bookPublisher = new BookPublisher(bookFileHandler);
                bookPublisher.printToFile();
                

	}
    
}

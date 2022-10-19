/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author peera
 */
import java.util.List;

public class BookReader implements BookScreenHandler{
    private BookFileHandler bookFileHandler ;
    
    public BookReader(BookFileHandler bookFileHandler){
        super();
        this.bookFileHandler = bookFileHandler ;
    };
    @Override
    public void printToScreen(){
        bookFileHandler.printToScreen();
    }
    
}

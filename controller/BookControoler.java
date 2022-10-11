package springapi.apidevelop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import springapi.apidevelop.service.BookService;
import springapi.apidevelop.Entity.Book;
@RestController
public class BookControoler {
    @Autowired
    public BookService service;
    @GetMapping("/books")
    public List<Book> getBook(){
        return this.service.getAllBook();
    }
    


}

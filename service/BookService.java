package springapi.apidevelop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import springapi.apidevelop.Entity.Book;
@Service
public class BookService {

    private static List<Book> list = new ArrayList<Book>();
    static{
         list.add(new Book(1,"churamaniverma","vermachuramani"));
         list.add(new Book(2,"mohansahu","sahumohan"));
         list.add(new Book(3,"govindbatt","battgovind"));
   
   
        }

        public List<Book> getAllBook(){
            return list;
        }
        
}

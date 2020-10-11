package com.yc.springcloud81.misprovider.control;



import com.yc.springcloud81.misprovider.service.BookService;
import com.yc.springcloud81_2.consumer.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liyan
 * @create 2020-10-2020/10/8-14:16
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("{id}")
    public Book getBook(@PathVariable("id" ) Integer id ){
        return bookService.getBook(id);
    }

    @GetMapping("findAll")
    public List<Book> getAll(){
       return bookService.findAll();
    };

}

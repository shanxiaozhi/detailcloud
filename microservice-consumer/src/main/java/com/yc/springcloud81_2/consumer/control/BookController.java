package com.yc.springcloud81_2.consumer.control;
import com.yc.springcloud81_2.consumer.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * @author liyan
 * @create 2020-10-2020/10/8-16:09
 */
@RestController
@RequestMapping("book")
public class BookController {
    String url="http://localhost:8888/book/";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("{id}")
    public Book getBook(@PathVariable("id" ) Integer id ){
        return restTemplate.getForObject(url+id, Book.class);
    }
    @GetMapping("findAll")
    public List<Book> getAllBook(){
        return restTemplate.getForObject(url+"findAll", List.class);
    }
}

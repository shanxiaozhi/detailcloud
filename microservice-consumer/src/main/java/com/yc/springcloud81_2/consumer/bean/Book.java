package com.yc.springcloud81_2.consumer.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;


//  lombok 注解，节省getter, setter
@Data
public class Book {
    private Integer bookId;   //注意: 对应的数据表中的字段名叫 book_id
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date bookDate;
    private Integer userId;
}


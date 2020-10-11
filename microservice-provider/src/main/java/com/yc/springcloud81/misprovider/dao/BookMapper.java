package com.yc.springcloud81.misprovider.dao;


import com.yc.springcloud81_2.consumer.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends MisBaseMapper<Book>{
}
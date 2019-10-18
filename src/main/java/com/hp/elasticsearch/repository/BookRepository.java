package com.hp.elasticsearch.repository;

import com.hp.elasticsearch.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @title:
 * @author: xiaodong
 * @date: 2019/10/18 08:31
 * @desc:
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    public List<Book> findByNameLike(String bookName);
}

package com.hp.elasticsearch.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author xiaodong
 * @title
 * @date 2019/10/18 08:32
 * @desc
 */
@Data
@ToString
@Document(indexName = "hpps",type = "book")
public class Book {

    private Integer id;
    private String name;
    private String author;
}

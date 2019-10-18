package com.hp.elasticsearch.bean;

import io.searchbox.annotations.JestId;
import lombok.Data;

/**
 * @author xiaodong
 * @title
 * @date 2019/10/17 16:05
 * @desc
 */
@Data
public class Article {

    @JestId
    private Integer id;
    private String author;
    private String title;
    private String content;

}

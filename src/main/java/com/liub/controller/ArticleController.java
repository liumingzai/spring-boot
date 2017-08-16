package com.liub.controller;

import com.liub.domain.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

/**
 * ArticleController
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/9.  @version：${VERSION}
 */
@RestController
public class ArticleController {

    private final static Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @GetMapping("findEsArticle")
    public List<Article> findEsArticle(){
        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(queryStringQuery("spring boot OR 书籍")).build();
        List<Article> articles = elasticsearchTemplate.queryForList(searchQuery, Article.class);
        return articles;
    }


}

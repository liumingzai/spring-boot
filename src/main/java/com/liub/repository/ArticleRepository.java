package com.liub.repository;

import com.liub.domain.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * ArticleRepository
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/9.  @version：${VERSION}
 */
public interface ArticleRepository extends ElasticsearchRepository<Article, Long> {


}

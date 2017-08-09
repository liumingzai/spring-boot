package com.liub;

import com.liub.domain.Article;
import com.liub.repository.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * ArticleTest
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/9.  @version：${VERSION}
 */

@RunWith(SpringRunner.class)  //底层基于junit
@SpringBootTest
public class ArticleTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void start(){
        System.out.println("Spring-data-elasticSearch自动建立索引库和创建实体的mapping信息");
    }

    @Test
    public void save(){
        Article article=new Article();
        article.setId(1L);
        article.setTitle("elasticsearch教程");
        article.setAbstracts("spring-data-elastichSearch");
        article.setContent("SpringBoot与spring-data-elastichSearch整合");
        article.setPostTime(new Date());
        article.setClickCount(100l);
        articleRepository.save(article);
    }
}

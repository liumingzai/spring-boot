package com.liub.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.io.Serializable;
import java.util.Date;


/**
 * LiubTest
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/9.  @version：${VERSION}
 */
@Document(indexName = "demo",type = "article",shards=1,replicas=0)
public class Article implements Serializable{

    private static final long serialVersionUID = 551589397625941750L;

    @Id
    private Long id;
    /**标题*/
    private String title;
    /**摘要*/
    private String abstracts;
    /**内容*/
    private String content;
    /**发表时间*/
    @Field(format = DateFormat.date_time,index = FieldIndex.no,store = false,type= FieldType.Auto)
    private Date postTime;
    /**点击率*/
    private Long clickCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Long getClickCount() {
        return clickCount;
    }

    public void setClickCount(Long clickCount) {
        this.clickCount = clickCount;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Article, {");
        sb.append("id=");
        sb.append(id);
        sb.append(", title=");
        sb.append(title);
        sb.append(", abstracts=");
        sb.append(abstracts);
        sb.append(", content=");
        sb.append(content);
        sb.append(", postTime=");
        sb.append(postTime);
        sb.append(", clickCount=");
        sb.append(clickCount);
        sb.append('}');
        return sb.toString();
    }
}

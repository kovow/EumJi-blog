package com.eumji.zblog.vo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("articleTag")
public class ArticleTag implements Serializable {

private Integer articleId;  //文章id

private Integer tagId;  //标签id

private String tagName;  //标签名

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "ArticleTag{" +
                "articleId=" + articleId +
                ", tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                '}';
    }
}

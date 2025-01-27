package com.hms.manage.infrastructure.dao;

import com.hms.manage.domain.article.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/28 00:12
 **/
@Mapper
public interface ArticleMapper {

    List<Article> findPage(Article article);

    List<Article> findList();

    Article findById(Long id);

    int insert(Article article);

    int update(Article article);

    int delete(Long id);

}

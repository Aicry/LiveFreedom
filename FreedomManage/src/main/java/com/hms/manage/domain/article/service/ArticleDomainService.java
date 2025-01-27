package com.hms.manage.domain.article.service;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Article;
import com.hms.manage.domain.article.repository.ArticleRepository;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author Hms
 * @Date 2024/11/20 23:15
 **/
@Service
public class ArticleDomainService {

    @Resource
    private ArticleRepository articleRepository;

    public String addArticleImage(MultipartFile file) {
        return null;
    }

    public PageInfo<Article> getArticle(BaseQueryDTO baseQueryDTO) {
        return null;
    }

    public Article getArticleDetail(BaseQueryDTO baseQueryDTO) {
        return new Article();
    }

    public String addArticle(Article article) {
        return null;
    }
}

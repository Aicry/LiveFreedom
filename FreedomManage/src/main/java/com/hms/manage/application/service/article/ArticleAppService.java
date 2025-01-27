package com.hms.manage.application.service.article;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Article;
import com.hms.manage.domain.article.service.ArticleDomainService;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.interfaces.article.api.ArticleAPI;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:16
 **/
@RestController
public class ArticleAppService implements ArticleAPI {

    @Resource
    private ArticleDomainService articleDomainService;

    @Override
    public ApiResponse<PageInfo<Article>> getArticle(BaseQueryDTO baseQueryDTO) {
        return ApiResponse.success(articleDomainService.getArticle(baseQueryDTO));
    }

    @Override
    public ApiResponse<Article> getArticleDetail(BaseQueryDTO baseQueryDTO) {
        return ApiResponse.success(articleDomainService.getArticleDetail(baseQueryDTO));
    }

    @Override
    public ApiResponse<String> addArticle(Article article) {
        return ApiResponse.success(articleDomainService.addArticle(article));
    }

    @Override
    public ApiResponse<String> addArticleImage(MultipartFile file) {
        return ApiResponse.success(articleDomainService.addArticleImage(file));
    }
}

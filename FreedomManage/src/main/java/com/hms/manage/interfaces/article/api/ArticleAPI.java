package com.hms.manage.interfaces.article.api;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Article;
import com.hms.manage.domain.article.entity.Category;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.infrastructure.annotation.Log;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.validation.Valid;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
   * @ClassName LoginAPI
   * @Author hms
   * @Date 2023/9/3 15:42
   * @Description TODO
   */
@RequestMapping(value = "/v1")
public interface ArticleAPI {

    @GetMapping("/article")
    ApiResponse<PageInfo<Article>> getArticle(@Param("") @Valid BaseQueryDTO baseQueryDTO);

    @GetMapping("/article/detail")
    ApiResponse<Article> getArticleDetail(@Param("") @Valid BaseQueryDTO baseQueryDTO);

    @PostMapping("/article")
    @Log("登录")
    ApiResponse<String> addArticle(@RequestBody Article article);

    @Log("上传文章封面")
    @PostMapping("/article/image")
    ApiResponse<String> addArticleImage(MultipartFile file);
}

package com.hms.manage.domain.article.repository;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Category;
import com.hms.manage.domain.article.entity.Tag;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:28
 **/
public interface CategoryRepository {
    List<Category> getCategory();

    Integer addCategory(Category category);

    Integer deleteCategory(List<Long> ids);

    List<Category> getCategoryList(String categoryName);
}

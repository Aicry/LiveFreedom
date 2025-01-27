package com.hms.manage.domain.article.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Category;
import com.hms.manage.domain.article.entity.Tag;
import com.hms.manage.domain.article.repository.CategoryRepository;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.infrastructure.config.SnowflakeGenerator;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 21:12
 **/
@Service
public class CategoryDomainService {

    @Resource
    private CategoryRepository categoryRepository;

    @Resource
    private SnowflakeGenerator snowflakeGenerator;

    public PageInfo<Category> getCategory(BaseQueryDTO baseQueryDTO) {
        PageHelper.startPage(baseQueryDTO.getCurrent(), baseQueryDTO.getSize());
        List<Category> list =  categoryRepository.getCategory();
        return new PageInfo<>(list);
    }

    public int addCategory(Category category) {
        category.init();
        category.setId(snowflakeGenerator.next());
        return categoryRepository.addCategory(category);
    }

    public Integer deleteCategory(List<Long> ids) {
        return categoryRepository.deleteCategory(ids);
    }

    public List<Category> getCategoryList(String categoryName) {
        return categoryRepository.getCategoryList(categoryName);
    }
}

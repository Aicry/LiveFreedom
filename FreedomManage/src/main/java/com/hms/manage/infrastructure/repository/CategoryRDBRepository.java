package com.hms.manage.infrastructure.repository;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Category;
import com.hms.manage.domain.article.repository.CategoryRepository;
import com.hms.manage.infrastructure.dao.CategoryMapper;
import jakarta.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:35
 **/
@Repository
public class CategoryRDBRepository implements CategoryRepository {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategory() {
        return categoryMapper.findPage();
    }

    @Override
    public Integer addCategory(Category category) {
        return categoryMapper.insert(category);
    }

    @Override
    public Integer deleteCategory(List<Long> ids) {
        if(CollectionUtils.isEmpty(ids)){
            return 0;
        }
        return categoryMapper.delete(ids);
    }

    @Override
    public List<Category> getCategoryList(String categoryName) {
        return categoryMapper.findList(categoryName);
    }
}

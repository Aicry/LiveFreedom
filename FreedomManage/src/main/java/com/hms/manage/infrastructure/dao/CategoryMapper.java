package com.hms.manage.infrastructure.dao;

import com.hms.manage.domain.article.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:38
 **/
@Mapper
public interface CategoryMapper {
    List<Category> findPage();

    List<Category> findList(String categoryName);

    Category findById(Long id);

    int insert(Category category);

    int update(Category Category);

    int delete(@Param("paramList") List<Long> ids);
}

package com.hms.manage.application.service.article;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Category;
import com.hms.manage.domain.article.entity.Tag;
import com.hms.manage.domain.article.service.CategoryDomainService;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.interfaces.article.api.CategoryAPI;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:16
 **/
@RestController
public class CategoryAppService implements CategoryAPI {

    @Resource
    private CategoryDomainService categoryDomainService;

    @Override
    public ApiResponse<PageInfo<Category>> getCategory(BaseQueryDTO baseQueryDTO) {
        return ApiResponse.success(categoryDomainService.getCategory(baseQueryDTO));
    }

    @Override
    public ApiResponse<Integer> addCategory(Category category) {
        return ApiResponse.success(categoryDomainService.addCategory(category));
    }

    @Override
    public ApiResponse<Integer> deleteCategory(List<Long> ids) {
        return ApiResponse.success(categoryDomainService.deleteCategory(ids));
    }

    @Override
    public ApiResponse<List<Category>> getCategoryList(String categoryName) {
        return ApiResponse.success(categoryDomainService.getCategoryList(categoryName));
    }
}

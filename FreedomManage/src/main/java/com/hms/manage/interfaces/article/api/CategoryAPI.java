package com.hms.manage.interfaces.article.api;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Category;
import com.hms.manage.domain.article.entity.Tag;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.infrastructure.annotation.Log;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.validation.Valid;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/v1")
public interface CategoryAPI {

    @GetMapping("/category")
    ApiResponse<PageInfo<Category>> getCategory(@Param("") @Valid BaseQueryDTO baseQueryDTO);

    @Log("新增分类")
    @PostMapping("/category")
    ApiResponse<Integer> addCategory(@Valid @RequestBody Category category);

    @Log("删除分类")
    @DeleteMapping("/category")
    ApiResponse<Integer> deleteCategory(@RequestBody List<Long> ids);

    @GetMapping("/category/list")
    ApiResponse<List<Category>> getCategoryList(String keyword);
}

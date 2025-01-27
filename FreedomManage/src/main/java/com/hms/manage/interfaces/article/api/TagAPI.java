package com.hms.manage.interfaces.article.api;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Tag;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.Role;
import com.hms.manage.infrastructure.annotation.Log;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.validation.Valid;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/19 19:40
 **/
@RequestMapping(value = "/v1")
public interface TagAPI {

    @GetMapping("/tag")
    ApiResponse<PageInfo<Tag>> getTag(@Param("") @Valid BaseQueryDTO baseQueryDTO);

    @Log("新增标签")
    @PostMapping("/tag")
    ApiResponse<Integer> addTag(@Valid @RequestBody Tag tag);

    @Log("删除标签")
    @DeleteMapping("/tag")
    ApiResponse<Integer> deleteTag(@RequestBody List<Long> ids);

    @GetMapping("/tag/list")
    ApiResponse<List<Tag>> getTagList(String keyword);
}

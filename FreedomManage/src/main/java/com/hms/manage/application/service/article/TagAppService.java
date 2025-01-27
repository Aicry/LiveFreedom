package com.hms.manage.application.service.article;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Tag;
import com.hms.manage.domain.article.service.TagDomainService;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.interfaces.article.api.TagAPI;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Author Hms
 * @Date 2024/11/20 20:15
 **/
@RestController
public class TagAppService implements TagAPI {

    @Resource
    private TagDomainService tagDomainService;

    @Override
    public ApiResponse<PageInfo<Tag>> getTag(BaseQueryDTO baseQueryDTO) {
        return ApiResponse.success(tagDomainService.getTag(baseQueryDTO));
    }

    @Override
    public ApiResponse<Integer> addTag(Tag tag) {
        return ApiResponse.success(tagDomainService.addTag(tag));
    }

    @Override
    public ApiResponse<Integer> deleteTag(List<Long> ids) {
        return ApiResponse.success(tagDomainService.deleteTag(ids));
    }

    @Override
    public ApiResponse<List<Tag>> getTagList(String tagName) {
        return ApiResponse.success(tagDomainService.getTagList(tagName));
    }
}

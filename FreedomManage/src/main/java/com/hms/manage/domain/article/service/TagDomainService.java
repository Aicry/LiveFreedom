package com.hms.manage.domain.article.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.article.entity.Tag;
import com.hms.manage.domain.article.repository.TagRepository;
import com.hms.manage.infrastructure.config.SnowflakeGenerator;
import com.hms.manage.interfaces.common.BaseQueryDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:26
 **/
@Service
public class TagDomainService {

    @Resource
    private TagRepository tagRepository;

    @Resource
    private SnowflakeGenerator snowflakeGenerator;

    public PageInfo<Tag> getTag(BaseQueryDTO baseQueryDTO) {
        PageHelper.startPage(baseQueryDTO.getCurrent(), baseQueryDTO.getSize());
        List<Tag> list =  tagRepository.getTags();
        return new PageInfo<>(list);
    }

    public int addTag(Tag tag) {
        tag.init();
        tag.setId(snowflakeGenerator.next());
        return tagRepository.addTag(tag);
    }

    public Integer deleteTag(List<Long> ids) {
        return tagRepository.deleteTag(ids);
    }

    public List<Tag> getTagList(String tagName) {
        return tagRepository.getTagList(tagName);
    }
}

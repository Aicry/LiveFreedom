package com.hms.manage.domain.article.repository;

import com.hms.manage.domain.article.entity.Tag;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:27
 **/
public interface TagRepository {
    List<Tag> getTags();

    Integer addTag(Tag tag);

    Integer deleteTag(List<Long> ids);

    List<Tag> getTagList(String keyword);
}

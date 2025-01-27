package com.hms.manage.infrastructure.repository;

import com.hms.manage.domain.article.entity.Tag;
import com.hms.manage.domain.article.repository.TagRepository;
import com.hms.manage.infrastructure.dao.TagMapper;
import jakarta.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:34
 **/
@Repository
public class TagRDBRepository implements TagRepository {

    @Resource
    private TagMapper tagMapper;

    @Override
    public List<Tag> getTags() {
        return tagMapper.findPage();
    }

    @Override
    public Integer addTag(Tag tag) {
        return tagMapper.insert(tag);
    }

    @Override
    public Integer deleteTag(List<Long> ids) {
        if(CollectionUtils.isEmpty(ids)){
            return 0;
        }
        return tagMapper.delete(ids);
    }

    @Override
    public List<Tag> getTagList(String tagName) {
        return tagMapper.findList(tagName);
    }
}

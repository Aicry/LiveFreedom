package com.hms.manage.infrastructure.dao;

import com.hms.manage.domain.article.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/20 20:39
 **/
@Mapper
public interface TagMapper {
    List<Tag> findPage();

    List<Tag> findList(String tagName);

    Tag findById(Long id);

    int insert(Tag tag);

    int update(Tag tag);

    int delete(@Param("paramList") List<Long> id);
}

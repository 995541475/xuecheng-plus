package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author hl
 * @version 1.0
 * @description
 * @date 2023/7/12 23:24
 */
public interface CourseCategoryService {

    /**
     * 课程分类树形结构查询
     *
     * @param id
     * @return
     */
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}

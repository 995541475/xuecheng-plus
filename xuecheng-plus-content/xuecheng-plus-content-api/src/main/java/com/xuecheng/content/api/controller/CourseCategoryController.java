package com.xuecheng.content.api.controller;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.service.CourseCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 课程分类控制类
 * @author: hl
 * @create: 2023-07-13
 */
@RestController
@RequestMapping("/course-category")
@Api(value = "课程分类接口", tags = "课程分类接口")
public class CourseCategoryController {
    @Autowired
    private CourseCategoryService courseCategoryService;

    /**
     * 课程分类树形结构查询
     * @param
     * @return
     */
    @GetMapping("/tree-nodes")
    @ApiOperation("课程分类树形结构查询")
    public List<CourseCategoryTreeDto> queryTreeNodes(){
        return courseCategoryService.queryTreeNodes("1");
    }
}

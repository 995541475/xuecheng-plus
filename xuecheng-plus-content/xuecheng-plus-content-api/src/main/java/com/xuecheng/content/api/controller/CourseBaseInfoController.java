package com.xuecheng.content.api.controller;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MyLong
 * @version 1.0
 * @description 课程信息编辑接口
 * @date 2023/7/3 22:57
 */
@RestController
@Api(value = "课程信息编辑接口", tags = "课程信息编辑接口")
@RequestMapping("/course")
public class CourseBaseInfoController {
    @Autowired
    private CourseBaseInfoService courseBaseInfoService;

    /**
     * 课程查询接口
     *
     * @param pageParams
     * @param QueryCourseParamsDto
     * @return
     */
    @PostMapping("/list")
    @ApiOperation("课程查询接口")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto QueryCourseParamsDto) {
        return courseBaseInfoService.queryCourseBaseList(pageParams, QueryCourseParamsDto);
    }

    /**
     * 新增课程基本信息
     *
     * @param addCourseDto
     * @return
     */
    @PostMapping
    @ApiOperation("新增课程基本信息")
    public CourseBaseInfoDto createCourseBase(@RequestBody @Validated AddCourseDto addCourseDto) {
        return courseBaseInfoService.createCourseBase(1232141425L, addCourseDto);
    }
}

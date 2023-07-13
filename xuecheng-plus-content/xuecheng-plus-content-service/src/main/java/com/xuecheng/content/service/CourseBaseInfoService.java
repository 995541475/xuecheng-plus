package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author MyLong
 * @version 1.0
 * @description 课程基本信息管理业务接口
 * @date 2023/7/9 11:00
 */
public interface CourseBaseInfoService {
    /**
     * 课程查询接口
     *
     * @param pageParams
     * @param queryCourseParamsDto
     * @return
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程基本信息
     *
     * @param companId
     * @param addCourseDto
     * @return
     */
    CourseBaseInfoDto createCourseBase(Long companId, AddCourseDto addCourseDto);
}

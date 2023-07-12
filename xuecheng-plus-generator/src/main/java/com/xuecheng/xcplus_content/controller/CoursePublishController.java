package com.xuecheng.xcplus_content.controller;

import com.xuecheng.xcplus_content.service.CoursePublishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 课程发布 前端控制器
 * </p>
 *
 * @author itcast
 */
@Slf4j
@RestController
@RequestMapping("coursePublish")
public class CoursePublishController {

    @Autowired
    private CoursePublishService coursePublishService;
}

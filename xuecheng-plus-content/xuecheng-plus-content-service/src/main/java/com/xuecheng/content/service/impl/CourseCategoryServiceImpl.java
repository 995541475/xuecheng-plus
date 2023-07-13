package com.xuecheng.content.service.impl;

import com.xuecheng.content.mapper.CourseCategoryMapper;
import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.service.CourseCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author hl
 * @version 1.0
 * @description
 * @date 2023/7/12 23:26
 */
@Service
@Slf4j
public class CourseCategoryServiceImpl implements CourseCategoryService {
    @Autowired
    private CourseCategoryMapper courseCategoryMapper;

    /**
     * 课程分类树形结构查询
     * @param id
     * @return
     */
    @Override
    public List<CourseCategoryTreeDto> queryTreeNodes(String id) {
        List<CourseCategoryTreeDto> courseCategoryTreeDtos = courseCategoryMapper.selectTreeNodes(id);
        //找到每个节点的子节点，最终封装成List<CourseCategoryTreeDto>
        //将list转map,key是节点的id,value就是CourseCategoryTreeDto对象，目的是为了方便从map获取节点
        //jdk8 toMap指定覆盖规则：toMap第三个参数，是以防当key一样时候报错，就是告诉当map里面有一个key，还要放进去一个key，以哪个为准（即当key重复时候要哪个元素）
        //将list转map,以备使用,排除根节点
        Map<String, CourseCategoryTreeDto> mapTemp = courseCategoryTreeDtos.stream()
                .filter(item -> !id.equals(item.getId()))
                .collect(Collectors.toMap(key -> key.getId(), value -> value, (key1, key2) -> key2));
        //定义一个list作为最终返回的list
        List<CourseCategoryTreeDto> categoryTreeDtoList = new ArrayList<>();
        //从头遍历List<CourseCategoryTreeDto>，一边遍历一边找子节点放在父节点的childrenTreeNodes
        //依次遍历每个元素,排除根节点
        courseCategoryTreeDtos.stream()
                .filter(item -> !id.equals(item.getId()))
                .forEach(item -> {
                    if (item.getParentid().equals(id)) {
                        categoryTreeDtoList.add(item);
                    }
                    //找到当前节点的父节点
                    CourseCategoryTreeDto courseCategoryTreeDto = mapTemp.get(item.getParentid());
                    if (courseCategoryTreeDto != null) {
                        //如何该父节点的ChildrenTreeNodes属性为空，要new一个集合，因为要向该集合中放它的子节点
                        if (courseCategoryTreeDto.getChildrenTreeNodes() == null) {
                            courseCategoryTreeDto.setChildrenTreeNodes(new ArrayList<CourseCategoryTreeDto>());
                        }
                        //找到每个节点的子节点 放在父节点的childrenTreeNodes属性中
                        courseCategoryTreeDto.getChildrenTreeNodes().add(item);
                    }
                });
        return categoryTreeDtoList;
    }
}

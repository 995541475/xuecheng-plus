package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import lombok.Data;

import java.util.List;

/**
 * @author hl
 * @version 1.0
 * @description 课程计划树型结构dto
 * @date 2023/8/6 22:05
 */
@Data
public class TeachplanDto extends Teachplan {
    //课程计划关联的媒资信息
    TeachplanMedia teachplanMedia;

    //子节点
    List<TeachplanDto> teachplanTreeNodes;

}

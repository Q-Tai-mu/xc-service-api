package com.xuecheng.api.course;

import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.Teachplan;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

/**
 * @author wuangjing
 * @create 2020/11/6-17:45
 * @Description: 课程计划查询SQL
 * SELECT
 * a.id one_id, # 第一纲课程id
 * a.pname one_pname, 第一纲课程名称（最外面的课程名称：java基础教程108集..）
 * b.id two_id, 第二纲课程id
 * b.pname two_pname, 第二纲课程名称 （课程目录章节名称：计算机原理）
 * c.id three_id, 第三纲课程id
 * c.pname three_pname 第三纲课程id （课程具体名称：什么是cpu）
 * FROM
 * teachplan a
 * LEFT JOIN teachplan b ON b.parentid = a.id # 当第一次自联 左外联查询结束后，其得到的结果作为第二次左外联的源表
 * LEFT JOIN teachplan c ON c.parentid = b.id # 使用的是第一次左外联产生的结果表作为其外联源表
 * WHERE # where 使用的是第二次左外联产生的结果表
 * a.parentid = '0'
 * AND a.courseid = '4028e581617f945f01617f9dabc40000'
 * ORDER BY # order by 排序 使用的是where 得到的结果表进行默认的 升序
 * a.orderby,
 * b.orderby,
 * c.orderby
 */
@Api(value = "课程管理接口", description = "课程管理接口 提供数据模型管理，查询接口")
public interface CourseControllerApi {

    @ApiOperation(value = "查询课程计划")
    public TeachplanNode findTeachplanList(String courseId);

    @ApiOperation(value = "添加课程计划")
    public ResponseResult addTeachplan(Teachplan teachplan);

    //修改课程计划
    @ApiOperation(value = "修改课程计划")
    public ResponseResult updateTeachplan(Teachplan teachplan);

    @ApiOperation(value = "添加课程基本信息")
    public ResponseResult courseBaseAdd(CourseBase courseBase);

    @ApiOperation(value = "查询课程基本信息")
    public QueryResponseResult findCourseInfo(Integer page, Integer size, Map<String, Object> map);
}

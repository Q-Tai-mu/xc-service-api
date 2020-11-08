package com.xuecheng.api.course;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author wuangjing
 * @create 2020/11/8-13:09
 * @Description:
SELECT
a.id one_id,
a.`name` one_name,
b.id two_id,
b.`name` two_name,
c.id three_id,
c.`name` three_name
FROM
category a
LEFT JOIN category b ON b.parentid = a.id
LEFT JOIN category c ON c.parentid = b.id
WHERE
a.parentid='0'
ORDER BY
a.orderby,
b.orderby,
c.orderby
 */
@Api(value = "课程分类管理",description = "课程分类管理",tags = {"课程分类管理"})
public interface CategoryControllerApi {

    @ApiOperation("查询分类")
    public CategoryNode findList();
}

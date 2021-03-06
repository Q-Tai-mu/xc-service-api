package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.domain.cms.response.CmsPostPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 嗨 我是来自uos中分支
 * @author wuangjing
 * @create 2020/10/24-10:05
 * @Description:
 */
@Api(value = "cms页面管理接口", description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {

    //页面查询
    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({@ApiImplicitParam(name = "page", value = "页码", required = true, paramType = "path", dataType = "int"), @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int")})
    public QueryResponseResult findList(Integer page, Integer size, QueryPageRequest queryPageRequest);


    @ApiOperation("新增页面")
    @ApiImplicitParams(@ApiImplicitParam(name = "cmsPage", value = "页面数据模型", required = true, dataType = "CmsPage"))
    public CmsPageResult add(CmsPage cmsPage);

    @ApiOperation("根据id查询页面")
    @ApiImplicitParams(@ApiImplicitParam(name = "pageId", value = "页面id", required = false, dataType = "String"))
    public CmsPage findById(String pageId);

    @ApiOperation("修改页面")
    @ApiImplicitParams({@ApiImplicitParam(name = "pageId", value = "页面id", required = true, dataType = "String"), @ApiImplicitParam(name = "cmsPage", value = "页面模型数据", required = true, paramType = "path", dataType = "CmsPage")})
    public CmsPageResult findByUpdate(String pageId, CmsPage cmsPage);

    @ApiOperation("根据id删除页面")
    @ApiImplicitParams(@ApiImplicitParam(name = "id", value = "页面Id", paramType = "path", required = true, dataType = "String"))
    public ResponseResult deleteId(String id);

    @ApiOperation("发布页面")
    @ApiImplicitParams(@ApiImplicitParam(name = "pageId", value = "页面id", paramType = "path", required = true, dataType = "String"))
    public ResponseResult post(String pageId);

    @ApiOperation(value = "保存页面")
    @ApiImplicitParams(@ApiImplicitParam(name = "cmsPage", value = "页面数据模型", required = true, dataType = "CmsPage"))
    public CmsPageResult save(CmsPage cmsPage);


    @ApiOperation(value = "一键页面发布")
    @ApiImplicitParams(@ApiImplicitParam(name = "cmsPage", value = "页面数据模型", required = true, dataType = "CmsPage"))
    public CmsPostPageResult postPageQuick(CmsPage cmsPage);
}


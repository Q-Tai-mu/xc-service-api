package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author wuangjing
 * @create 2020/11/1-10:40
 * @Description:
 */
@Api(value = "cms配置管理接口",description = "cms配置管理接口 提供数据模型管理，查询接口")
public interface CmsConfigControllerApi {

    @ApiOperation("根据id查询cms配置信息")
    public CmsConfig findModel(String id);
}

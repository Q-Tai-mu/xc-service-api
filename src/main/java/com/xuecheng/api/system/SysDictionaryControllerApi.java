package com.xuecheng.api.system;

import com.xuecheng.framework.domain.system.SysDictionary;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author wuangjing
 * @create 2020/11/10-11:56
 * @Description:
 */
@Api(value = "数据字典接口",description = "提供数据字典接口的管理和查询")
public interface SysDictionaryControllerApi {

    @ApiOperation("根据字典类型查询相关字典")
    public SysDictionary getByType(String type);
}

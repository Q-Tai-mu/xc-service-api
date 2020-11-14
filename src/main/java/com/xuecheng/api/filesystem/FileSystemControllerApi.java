package com.xuecheng.api.filesystem;

import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author wuangjing
 * @create 2020/11/13-15:05
 * @Description: 文件上传和下载
 */
@Api(value = "文件的上传于下载", description = "管理文件上传和下载的接口")
public interface FileSystemControllerApi {
    @ApiOperation(value = "文件的上传", tags = {"文件上传"})
    public UploadFileResult uploadFile(MultipartFile file, String filetag, String businesskey, String metadata);
}

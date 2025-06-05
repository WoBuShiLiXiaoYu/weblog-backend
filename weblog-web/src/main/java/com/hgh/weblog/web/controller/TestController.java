package com.hgh.weblog.web.controller;

import com.hgh.weblog.common.aspect.ApiOperationLog;
import com.hgh.weblog.common.enums.ResponseCodeEnum;
import com.hgh.weblog.common.exception.BizException;
import com.hgh.weblog.common.utils.JsonUtil;
import com.hgh.weblog.common.utils.Response;
import com.hgh.weblog.web.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;

@RestController
@Slf4j
@Api(tags = "首页模块")
public class TestController {

    @ApiOperationLog(description = "测试接口")
    @PostMapping("/test")
    @ApiOperation("测试接口")
    public Response test(@RequestBody @Validated User user) {

        // 是否存在校验错误
        /*if (bindingResult.hasErrors()) {
            // 获取校验不通过字段的提示信息
            String errorMsg = bindingResult.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .collect(Collectors.joining(", "));

            // return ResponseEntity.badRequest().body(errorMsg);
            return Response.fail(errorMsg);
        }
        // return ResponseEntity.ok("参数没有任何问题");
        return Response.success();*/

        //throw new BizException(ResponseCodeEnum.PRODUCT_NOT_FOUND);

        /*int i = 1 / 0;
        return Response.success();*/

        // 打印入参
        log.info(JsonUtil.toJsonString(user));

        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());

        return Response.success(user);
    }
}

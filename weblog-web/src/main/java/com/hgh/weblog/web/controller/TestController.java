package com.hgh.weblog.web.controller;

import com.hgh.weblog.common.aspect.ApiOperationLog;
import com.hgh.weblog.common.utils.Response;
import com.hgh.weblog.web.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@Slf4j
public class TestController {

    @ApiOperationLog(description = "测试接口")
    @PostMapping("/test")
    public Response test(@RequestBody @Validated User user, BindingResult bindingResult) {
        // 是否存在校验错误
        if (bindingResult.hasErrors()) {
            // 获取校验不通过字段的提示信息
            String errorMsg = bindingResult.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .collect(Collectors.joining(", "));

            // return ResponseEntity.badRequest().body(errorMsg);
            return Response.fail(errorMsg);
        }
        // return ResponseEntity.ok("参数没有任何问题");
        return Response.success();
    }
}

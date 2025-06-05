package com.hgh.weblog.common.enums;

import com.hgh.weblog.common.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误码枚举
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {

    // --------------- 通用异常状态码 ---------------
    SYSTEM_ERROR("10000", "出错啦！正在修复中..."),
    PARAM_NOT_VALID("10001", "参数错误"),

    // --------------- 业务异常状态码 ---------------
    PRODUCT_NOT_FOUND("20000", "该产品不存在（测试使用！）"),
    ;



    // 异常码
    private String errorCode;

    // 异常信息
    private String errorMessage;
}

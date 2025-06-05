package com.hgh.weblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 业务异常
 */
@Getter
@Setter
public class BizException extends RuntimeException{

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }

    // 异常码
    private String errorCode;

    // 异常信息
    private String errorMessage;

}

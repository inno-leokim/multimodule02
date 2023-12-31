package com.brand13.multiapi.exceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.brand13.modulecommon.enums.CodeEnum;
import com.brand13.multiapi.exception.CustomException;
import com.brand13.multiapi.response.CommonResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(CustomException.class)
    public CommonResponse handlerCustomException(CustomException e){
        return CommonResponse.builder()
                    .returnCode(e.getReturnCode())
                    .returnMessage(e.getReturnMessage())
                    .build();                   
    }

    // 미처 만들지 못한 커스텀 exception이 있을 경우 아래 handler를 거친다.
    @ExceptionHandler(Exception.class)
    public CommonResponse handlerException(Exception e){
        return CommonResponse.builder()
                    .returnCode(CodeEnum.UNKNOWN_ERROR.getCode())
                    .returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage())
                    .build();
    }
}

package com.brand13.multiapi.service;

import org.springframework.stereotype.Service;

import com.brand13.modulecommon.enums.CodeEnum;
import com.brand13.modulecommon.service.CommonDemoService;
import com.brand13.multiapi.exception.CustomException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService; //주입받기 위해 롬복 사용
    
    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        return "find";
    }

    public String exception() {
        // 실무에서는 raw한 exception을 그냥 던져주지 않는다. 
        // customizing된 예외처리 객체를 작성하여 던져준다.
        if(true){ // 예) if(exception == IllegalArgumentException.class)
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }

        return "exception";
    }
}

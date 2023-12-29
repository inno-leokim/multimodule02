package com.brand13.multiapi.service;

import org.springframework.stereotype.Service;

import com.brand13.modulecommon.enums.CodeEnum;
import com.brand13.modulecommon.service.CommonDemoService;

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
}

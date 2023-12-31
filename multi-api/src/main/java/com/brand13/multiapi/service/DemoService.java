package com.brand13.multiapi.service;

import org.springframework.stereotype.Service;

import com.brand13.modulecommon.domain.Member;
import com.brand13.modulecommon.enums.CodeEnum;
import com.brand13.modulecommon.repository.MemberRepository;
import com.brand13.modulecommon.service.CommonDemoService;
import com.brand13.multiapi.exception.CustomException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService; //주입받기 위해 롬복 사용

    private final MemberRepository memberRepository;
    
    public String save() {
        //Thread.currentThread().getName()는 Random값을 생성한다. 
        memberRepository.save(Member.builder()
                                    .name(Thread.currentThread().getName())
                                    .build()
        );
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        System.out.println("DB size : " + size);
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

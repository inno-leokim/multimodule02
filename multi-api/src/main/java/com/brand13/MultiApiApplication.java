package com.brand13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 매우 중요!!
 * 컴포넌트 스캔방법:
 * 
 * 방법 1
 * module-common의 컴포넌트(컴포넌트 스캔)를 사용하기 위해 com.brand13까지 경로가 맞춰줘야 한다. 
 * 따라서 application 파일을 한단계 바깥으로 빼주어야 한다. 
 * 
 * 방법 2(실무)
 * 아래와 같이 스캔하고자 하는 프로젝트를 
 * scanBasePackages안에 배열형태로 명시한다!!
 */
@SpringBootApplication(
	scanBasePackages = {
		"com.brand13.multiapi",
		"com.brand13.modulecommon"
	}
)
public class MultiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiApiApplication.class, args);
	}

}

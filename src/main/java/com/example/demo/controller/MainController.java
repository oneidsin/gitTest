package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping(value = "/")
	public String main() {
		
		logger.info("hello 신혁재");
		logger.info("브랜치 초기화 : 특정한 커밋의 상태로 완전히 되돌려 버리는 것.");
		logger.info("커밋 되돌리기(리버스 커밋) : 특정 커밋에서 행한 작업을 취소하여 커밋을 추가하는 것.");

		return "{\"msg\":\"OK\"}";
	}
	
	@GetMapping(value = "/list")
	public String list() {
		return "";
	}
	
	
}

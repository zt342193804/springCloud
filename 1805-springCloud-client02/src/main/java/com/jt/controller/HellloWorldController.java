package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellloWorldController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("hello")
	@ResponseBody
	private String sayHi(String name){
		return "hello  "+name +" this port is :"+port;
	}
}

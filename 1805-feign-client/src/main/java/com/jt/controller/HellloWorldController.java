package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.service.HelloService;

@Controller
public class HellloWorldController {

	@Autowired
	private HelloService helloservice;
	
	@RequestMapping("hello")
	@ResponseBody
	private String sayHi(String name){
		String result=helloservice.sayHello(name);
		return "feign  "+result;
	}
}

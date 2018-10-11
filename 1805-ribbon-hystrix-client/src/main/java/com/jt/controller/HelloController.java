package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.jt.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(String name){
		
		String forObject = helloService.sayHello(name);
		return "ribbon+hystrix:"+forObject;
	}
}

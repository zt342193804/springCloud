package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(String name){
		
		String forObject = restTemplate.getForObject
				("http://service-hi/hello?name="+name, String.class);
		return "ribbon:"+forObject;
	}
}

package com.jt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="sayHello")
	public String sayHello(String name){
		String forObject = restTemplate.getForObject
				("http://service-hi/hello?name="+name, String.class);
		return forObject;
	};
	
	public String sayHelloEr(String name){
		String forObject = restTemplate.getForObject
				("http://service-hi/hello?name="+name, String.class);
		return forObject;
	}
}

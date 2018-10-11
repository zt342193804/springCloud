package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class StartRibbonHystrixClient 
{
    public static void main( String[] args )
    {
       SpringApplication.run(StartRibbonHystrixClient.class, args);
    }
    
  //生成一个restTemplate的对象,实现负载均衡的访问逻辑
  	@Bean
  	@LoadBalanced//restTemplate访问服务的负载均衡启动
  	public RestTemplate getSource(){
  		return new RestTemplate();
  	}
}

package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StartEnrekaClient03 
{
    public static void main( String[] args )
    {
       SpringApplication.run(StartEnrekaClient03.class, args);
    }
}

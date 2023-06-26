package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.HelloWorldBean;

@RestController
public class helloworldcontroller {

	@GetMapping(path="/hello-world")  
	
	public String hello()
	
	{
		
		return "myworld";
	}
	
	@GetMapping(path="/hello-world-bean")  
	public HelloWorldBean helloWorldBean()  
	{  
	return new HelloWorldBean("Hello World"); //constructor of HelloWorldBean  
	}  
	@GetMapping(path="/hello-world/path-variable/{name}")  
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)  
	{  
	return new HelloWorldBean(String.format("Hello World, %s", name)); //%s replace the name  
	}  
}

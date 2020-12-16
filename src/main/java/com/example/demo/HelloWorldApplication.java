package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Component.DemoBean;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("demoBean  " + demoBean.toString());
	}

}

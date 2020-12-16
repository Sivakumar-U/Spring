package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Component.DemoBean;
import com.example.demo.Controller.HelloRestController;

@SpringBootApplication
public class HelloWorldApplication {

	public static Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

	public static void main(String[] args) {
		logger.debug("Hello world");
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("demoBean  " + demoBean.toString());
		HelloRestController controller = context.getBean(HelloRestController.class);
		logger.debug(controller.toString());
	}

}

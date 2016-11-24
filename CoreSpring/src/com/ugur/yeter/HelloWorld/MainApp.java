package com.ugur.yeter.HelloWorld;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld_2");

		objA.setMessage("I'm object A");
		objA.getMessage();

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();

		context.registerShutdownHook();

		context.close();

	}
}

package com.ugur.yeter.parentBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanParentMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanParentDefinition.xml");

		HelloWorldParentBean objA = (HelloWorldParentBean) context
				.getBean("helloWorld");

		objA.getMessage1();
		objA.getMessage2();

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();

	}
}

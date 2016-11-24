package com.ugur.yeter.constructorBased.depinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepInjMainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DepInjBeans.xml");

		TextEditor tex = (TextEditor) context.getBean("textEditor");

		tex.spellCheck();
	}
}

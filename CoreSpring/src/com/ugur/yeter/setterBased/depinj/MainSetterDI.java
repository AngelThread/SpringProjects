package com.ugur.yeter.setterBased.depinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterDI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SetterDepInjBeans.xml");

		TextEditorSetter te = (TextEditorSetter) context.getBean("textEditor");

		te.spellCheck();

	}

}

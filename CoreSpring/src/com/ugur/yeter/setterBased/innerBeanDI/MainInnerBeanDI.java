package com.ugur.yeter.setterBased.innerBeanDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInnerBeanDI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"InnerBeans.xml");

		TextEditorInnerBean te = (TextEditorInnerBean) context.getBean("textEditor");

		te.spellCheck();

	}

}

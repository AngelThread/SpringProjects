package com.ugur.yeter.HelloWorld;

import org.springframework.beans.factory.DisposableBean;

public class HelloWorld implements DisposableBean {
	private String message;
	private int number;
	public static int y = 2;

	

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
	
	private void init() {
		number = 10;
		
		System.out.println("This bean is initilazed "+this.message);
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This bean is destroyed "+this.message);
	}
	
	 /*public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }*/
}
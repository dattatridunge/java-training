package com.BeanInitDestroy;

import org.springframework.beans.factory.InitializingBean;

public class Restaraunt  {

	
	public void init() {
		System.out.println("Restaraunt Bean is going through init");
	}
	public void greetCustomer() {
		System.out.println("Welcome customer !!  this is lifecycle demo");
	}
	public void destroy() {
		System.out.println("Restaraunt Bean will destroy now");
	}
	
	

}

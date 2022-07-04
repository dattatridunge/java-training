package com.ApplicationAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Applicationcontext implements ApplicationContextAware,BeanNameAware{

	
	private ApplicationContext context=null;

	public void run() {
		System.out.println("My classs is aware of Application context Aware");
		}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("BeanName is:" + beanName);
		
	}
	
	
	
	
	
}

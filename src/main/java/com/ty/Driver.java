package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Person person=(Person)context.getBean("person");
		person.run();
	}
}

package com.onebill.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.onebill.springannotation"})
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		Mobile bean = context.getBean(Mobile.class);
		System.out.println(bean);
	}
}

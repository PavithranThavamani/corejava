package com.onebill.penannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.onebill.penannotations" })
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		BookStall stall = context.getBean(BookStall.class);
//		System.out.println(stall);
		stall.getPen().write();
	}
}

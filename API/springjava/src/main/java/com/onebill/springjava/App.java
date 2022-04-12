package com.onebill.springjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        Car bean = context.getBean( Car.class);
        System.out.println(bean);
    }
}

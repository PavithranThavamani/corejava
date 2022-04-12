package com.onebill.springjava;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.onebill.springjava")
public class CarConfig {

////	@Bean(name = "audi" ,autowire = Autowire.BY_TYPE)
////	public Car getCar() {
////		Car car = new Car();
////		car.setBrand("Audi");
////		car.setModel("R8");
////		car.setPrice(10000000);
//////		car.setEngine();
////		return car;
//		@Bean(name = "audi" )
//		public Car getCar() {
//			Car car = new Car();
//			car.setBrand("Audi");
//			car.setModel("R8");
//			car.setPrice(10000000);
////		car.setEngine();
//			return car;
//	}
//	@Bean(name = "suzuki")
//	public Car getCar1() {
//		Car car = new Car();
//		car.setBrand("Bugatti");
//		car.setModel("Veryon");
//		car.setPrice(10000000);
//		return car;
//	}
//	
//	@Bean(name = "engine")
//	public Engine engine() {
//		Engine engine = new Engine();
//		engine.setSize("Medium");
//		engine.setHorsePower("1000");
//		return engine;
//	}
//	@Bean(name = "eng2")
//	public Engine engine1() {
//		Engine engine = new Engine();
//		engine.setSize("Big");
//		engine.setHorsePower("1500");
//		return engine;
//	}
	

}

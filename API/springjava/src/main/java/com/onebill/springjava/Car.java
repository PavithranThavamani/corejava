package com.onebill.springjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Car {

	private String brand;
	private String model;
	private double price;
	@Autowired
	private Engine engine;
}

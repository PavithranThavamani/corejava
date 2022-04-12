package com.onebill.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Mobile {

	@Value(value = "Rajan")
	String name;
	@Value(value = "iPhone")
	String brand;
	@Value(value = "100000")
	double price;
	
	@Autowired
	Sim sim;
}

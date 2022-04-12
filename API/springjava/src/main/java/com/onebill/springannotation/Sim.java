package com.onebill.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Sim {

	@Value(value = "Airtel")
	String brand;
	@Value(value = "1231231231")
	double number;
}

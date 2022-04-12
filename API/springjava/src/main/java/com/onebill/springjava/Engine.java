package com.onebill.springjava;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Engine {

	private String size;
	private String horsePower;
}

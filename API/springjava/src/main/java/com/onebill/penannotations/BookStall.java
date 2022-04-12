package com.onebill.penannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BookStall {

	@Value(value = "Cool Suresh")
	String name;
	@Value(value = "Pollachi")
	String place;
	@Autowired
	@Qualifier
	Pen pen;
}

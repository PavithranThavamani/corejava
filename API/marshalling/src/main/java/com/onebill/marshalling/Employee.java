package com.onebill.marshalling;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Employee {

	int id;
	String name;
	String designation;
	double salary;
}

package com.onebill.servletcookie;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	private int id;
	private String name;
	private double salary;
	private String designation;
}

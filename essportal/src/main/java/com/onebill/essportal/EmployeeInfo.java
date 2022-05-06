package com.onebill.essportal;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_Info")
public class EmployeeInfo {
	

	@Id
	private int employee_id;
	@Column(length = 50)
	private String employee_name;
	private String employee_type;
	@Column(length = 100)
	private String email;
	@Column(length = 50)
	private String  password;
//	@OneToMany
//	private List<LeaveInfo> leave;

}

package com.onebill.essportal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Leave_Info")
public class LeaveInfo {

	@Id
	private int employee_id;
	private String leave_date;
	private String leave_status;
}

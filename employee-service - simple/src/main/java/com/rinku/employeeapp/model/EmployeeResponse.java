package com.rinku.employeeapp.model;

import lombok.Data;

@Data
public class EmployeeResponse {

	private int employeeId;
	private String employeeName;
	private String departmentName;
	private String role;
	private double salary;
	private AddressResponse address;

}

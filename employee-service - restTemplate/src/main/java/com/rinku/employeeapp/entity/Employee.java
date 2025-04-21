package com.rinku.employeeapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {
	@Id
	@GeneratedValue( strategy = jakarta.persistence.GenerationType.AUTO )
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	@Column(name = "department")
	private String department;

	@Column(name = "designation")
	private String designation;

	@Column(name = "salary")
	private double salary;


}

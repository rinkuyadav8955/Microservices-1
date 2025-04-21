package com.rinku.address.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table( name = "address" )
@Data
public class Address {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id")
	private Integer id;

	@Column( name = "street" )
	private String street;
	@Column( name = "colony")
	private String colony;
	@Column( name = "postalcode")
	private String postalCode;
	@Column( name = "city")
	private String city;
	@Column( name = "state")
	private String state;
	@Column( name = "country")
	private String country;
	@Column(name = "employeeid")
	private int employeeId;
}

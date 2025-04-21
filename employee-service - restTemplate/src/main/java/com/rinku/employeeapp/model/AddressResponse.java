package com.rinku.employeeapp.model;

import lombok.Data;

@Data
public class AddressResponse {
	private Integer addressId;
	private String street;
	private String colony;
	private String postalCode;
	private String city;
	private String state;
	private String country;

}

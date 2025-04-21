package com.rinku.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rinku.address.model.AddressResponse;
import com.rinku.address.service.AddressService;

@RestController
@RequestMapping("/api/v1")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddress( @PathVariable("employeeId") Integer p_employeeId ) {
		AddressResponse l_addressResponse = addressService.getEmployeeAddress( p_employeeId );
		return ResponseEntity.status( HttpStatus.OK ).body( l_addressResponse );
	}

}

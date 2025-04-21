package com.rinku.employeeapp.employee_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.rinku.employeeapp.model.AddressResponse;

@FeignClient( name = "address-client", url = "http://localhost:8080" )
public interface AddressClient {

	@GetMapping( "/addresses/{id}" )
	AddressResponse getAddressById( @PathVariable( "id" ) Integer id );
}



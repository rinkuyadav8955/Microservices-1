package com.rinku.employeeapp.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.rinku.employeeapp.entity.Employee;
import com.rinku.employeeapp.mapper.EmployeeToEmployeeResponseMapper;
import com.rinku.employeeapp.model.AddressResponse;
import com.rinku.employeeapp.model.EmployeeResponse;
import com.rinku.employeeapp.repo.EmployeeRepository;

@PropertySource( "classpath:application.properties" )
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	WebClient webClient;

	public EmployeeResponse getEmployeeById( Integer p_id ) {

		EmployeeToEmployeeResponseMapper l_responseMapper = Mappers.getMapper( EmployeeToEmployeeResponseMapper.class );

		AddressResponse l_addressResponse = webClient
											.get()
											.uri( "/address/"+p_id )
											.retrieve()
											.bodyToMono( AddressResponse.class )
											.block();
		Employee l_employee = employeeRepository.findById( p_id ).get();
		EmployeeResponse l_employeeResponse =l_responseMapper.mapEmployeeToEmployeeResponse( l_employee );
		l_employeeResponse.setAddress( l_addressResponse );
		return l_employeeResponse;
	}



//	public EmployeeResponse getEmployeeById( Integer p_id ) {
//
//		EmployeeToEmployeeResponseMapper l_responseMapper = Mappers.getMapper( EmployeeToEmployeeResponseMapper.class );
//
//		AddressResponse l_addressResponse = null;
//		Employee l_employee = employeeRepository.findById( p_id ).get();
//		EmployeeResponse l_employeeResponse =l_responseMapper.mapEmployeeToEmployeeResponse( l_employee );
//		l_employeeResponse.setAddress( l_addressResponse );
//		return l_employeeResponse;
//	}

}

package com.rinku.employeeapp.service;

import java.util.Optional;
import org.apache.catalina.mapper.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import com.rinku.employeeapp.employee_service.AddressClient;
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

//	@Autowired
//	AddressClient addressClient;


	public EmployeeResponse getEmployeeById( Integer p_id ) {

		EmployeeToEmployeeResponseMapper l_responseMapper = Mappers.getMapper( EmployeeToEmployeeResponseMapper.class );

		AddressResponse l_addressResponse = null;
		Employee l_employee = employeeRepository.findById( p_id ).get();
		EmployeeResponse l_employeeResponse =l_responseMapper.mapEmployeeToEmployeeResponse( l_employee );
		l_employeeResponse.setAddress( l_addressResponse );
		return l_employeeResponse;
	}

}

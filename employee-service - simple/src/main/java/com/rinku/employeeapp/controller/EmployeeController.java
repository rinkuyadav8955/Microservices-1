package com.rinku.employeeapp.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rinku.employeeapp.entity.Employee;
import com.rinku.employeeapp.model.EmployeeResponse;
import com.rinku.employeeapp.repo.EmployeeRepository;
import com.rinku.employeeapp.service.EmployeeService;

@RestController()
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("employee/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeById( @PathVariable("id") Integer p_id ) {
		EmployeeResponse l_employee = employeeService.getEmployeeById( p_id );
		return ResponseEntity.status( HttpStatus.OK ).body( l_employee );
	}

}

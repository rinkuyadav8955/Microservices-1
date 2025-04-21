package com.rinku.employeeapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.rinku.employeeapp.entity.Employee;
import com.rinku.employeeapp.model.EmployeeResponse;

@Mapper
public interface EmployeeToEmployeeResponseMapper {

	@Mapping( target = "salary", source = "salary" )
	@Mapping( target = "role", source = "designation" )
	@Mapping( target = "departmentName", source = "department" )
	@Mapping( target = "employeeName", source = "name" )
	@Mapping( target = "employeeId", source = "id" )
	EmployeeResponse mapEmployeeToEmployeeResponse( Employee p_employee );

}

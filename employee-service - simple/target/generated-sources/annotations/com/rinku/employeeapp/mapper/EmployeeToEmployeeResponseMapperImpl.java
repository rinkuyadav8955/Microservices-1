package com.rinku.employeeapp.mapper;

import com.rinku.employeeapp.entity.Employee;
import com.rinku.employeeapp.model.EmployeeResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-08T22:59:56+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
public class EmployeeToEmployeeResponseMapperImpl implements EmployeeToEmployeeResponseMapper {

    @Override
    public EmployeeResponse mapEmployeeToEmployeeResponse(Employee p_employee) {
        if ( p_employee == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setSalary( p_employee.getSalary() );
        employeeResponse.setRole( p_employee.getDesignation() );
        employeeResponse.setDepartmentName( p_employee.getDepartment() );
        employeeResponse.setEmployeeName( p_employee.getName() );
        employeeResponse.setEmployeeId( p_employee.getId() );

        return employeeResponse;
    }
}

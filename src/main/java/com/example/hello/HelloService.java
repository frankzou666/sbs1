package com.example.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service 
public class HelloService {
	
	@Autowired
	private HelloRepository helloRepository;
	
	public Employee findEmployeeById(String id) {
		//get server from repository
		Map<String ,Object> employees = helloRepository.getUserById(id);
		String employeeId = (String)employees.get("id");
		String employeeName = (String)employees.get("name");
		int employeeAge = (Integer)employees.get("age");
		
		//create employee object
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeAge(employeeAge);
		employee.setEmployeeName(employeeName);
		
		return employee;
		
	}
	

}

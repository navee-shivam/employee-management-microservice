package com.employee.system.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.system.client.EmployeeClient;
import com.employee.system.entity.Department;
import com.employee.system.entity.Employee;

@RestController
public class EmployeeInfoController {
	@Autowired
	EmployeeClient employeeClient;
	
	@Value("${server.port}")
	private int serverPort;

	@GetMapping("/getEmployee")
	public Employee getEmployee() {
		Department department = employeeClient.getDepartment().getBody();
		return new Employee(1, "Mano naveen", department.getDepartment(),department.getPort());
	}
}

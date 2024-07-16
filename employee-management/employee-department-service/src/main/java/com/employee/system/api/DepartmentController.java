package com.employee.system.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.system.Entity.Department;

@RestController
public class DepartmentController {
	
	@Value("${server.port}")
	private int serverPort;

	@GetMapping("/getDepartment")
	public Department getDepartment() {
		return new Department(1, "Developer Support", serverPort);
	}
}

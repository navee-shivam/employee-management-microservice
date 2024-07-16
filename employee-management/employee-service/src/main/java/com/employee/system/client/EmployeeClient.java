package com.employee.system.client;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.system.configuration.RibbonConfiguration;
import com.employee.system.entity.Department;

@FeignClient(name = "employee-department-service")
@LoadBalancerClient(name="employee-department-service",configuration = RibbonConfiguration.class)
public interface EmployeeClient {

	@GetMapping("/getDepartment")
	public ResponseEntity<Department> getDepartment();

}
 
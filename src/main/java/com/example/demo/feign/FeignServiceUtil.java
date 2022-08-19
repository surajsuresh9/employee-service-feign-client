package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Employee;

@FeignClient(name = "employee-service", url = "http://localhost:8085")
public interface FeignServiceUtil {

	@GetMapping("/api/employee/")
	public List<Employee> getEmployees();

	@GetMapping("/api/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long id);
	
}

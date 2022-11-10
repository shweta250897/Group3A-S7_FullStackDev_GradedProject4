package com.glearning.employeeManagement.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.glearning.employeeManagement.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployeeById(long id);
	
	public void deleteEmployeeById(long id);
	
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}

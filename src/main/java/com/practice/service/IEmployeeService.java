package com.practice.service;

import com.practice.dto.EmployeeRegDTO;

public interface IEmployeeService {
	public String calculateGrossNetSalary(EmployeeRegDTO empDto) throws Exception;

}

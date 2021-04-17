package com.practice.controller;

import com.practice.dto.EmployeeRegDTO;
import com.practice.service.IEmployeeService;
import com.practice.vo.EmployeeRegVO;

public class EmployeeRegController {
	private IEmployeeService empService;


	/**
	 * @param empService the empService to set
	 */
	public void setEmpService(IEmployeeService empService) {
		this.empService = empService;
	}
	public  String  employeeReg(EmployeeRegVO vo)throws Exception {
		EmployeeRegDTO dto=new EmployeeRegDTO();
		dto.seteName(vo.geteName());
		dto.setBasicSalary(Float.valueOf(vo.getBasicSalary()));
		
		String result=empService.calculateGrossNetSalary(dto);
		return result;
	} 

}

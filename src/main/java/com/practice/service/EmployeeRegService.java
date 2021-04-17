package com.practice.service;

import com.practice.DAO.IEmployeeReg;
import com.practice.bo.EmployeeRegBo;
import com.practice.dto.EmployeeRegDTO;

public class EmployeeRegService implements IEmployeeService {
	private IEmployeeReg empReg;
	
	

	/**
	 * @param empReg the empReg to set
	 */
	public void setEmpReg(IEmployeeReg empReg) {
		this.empReg = empReg;
	}



	public String calculateGrossNetSalary(EmployeeRegDTO empDto) throws Exception {
		Float grossSalary=empDto.getBasicSalary()!=null?empDto.getBasicSalary()+(empDto.getBasicSalary()*40/100):0;
		Float netSalary=Float.compare(grossSalary, 0)!=0? (grossSalary-grossSalary*20/100):0;
		EmployeeRegBo empBo =new EmployeeRegBo();
		empBo.seteName(empDto.geteName());
		empBo.setBasicSalary(empDto.getBasicSalary());
		empBo.setGrossSalary(grossSalary);
		empBo.setNetSalary(netSalary);
		int count =empReg.insert(empBo);
		return count !=0 ?"Success":"Faileds";
	}

}

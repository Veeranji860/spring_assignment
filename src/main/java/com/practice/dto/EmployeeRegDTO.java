package com.practice.dto;

import java.io.Serializable;

public class EmployeeRegDTO implements Serializable {
	private String eName;
	private Float basicSalary;
	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}
	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}
	/**
	 * @return the basicSalary
	 */
	public Float getBasicSalary() {
		return basicSalary;
	}
	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(Float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
}

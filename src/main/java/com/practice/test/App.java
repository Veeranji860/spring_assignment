package com.practice.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.practice.controller.EmployeeRegController;
import com.practice.vo.EmployeeRegVO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter Employee name::");
		String name=sc.next();
		System.out.println("enter Employee Salary::");
		String sal=sc.next();
		
		
		EmployeeRegVO vo=new EmployeeRegVO();
		vo.seteName(name);vo.setBasicSalary(sal);
		//create IOC container
		 DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/practice/cfg/applicatonContext.xml");
		 //get Controller class obj 
		 EmployeeRegController controller=factory.getBean("controller",EmployeeRegController.class);
		 //invoke the methods
		 try {
			 String result=controller.employeeReg(vo);
			 System.out.println(result);
		 }
		 catch(Exception e) {
			 //e.printStackTrace();
			 System.out.println("Internal Problem --Try Again:::"+e.getMessage());
		 }
    }
}

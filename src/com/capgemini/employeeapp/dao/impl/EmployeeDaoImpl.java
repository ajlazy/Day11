package com.capgemini.employeeapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employeeapp.dao.EmployeeDao;
import com.capgemini.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private List<Employee> employees=new ArrayList<>();

	@Override
	public Employee findEmployeesById(int employeeId)
 {
		
		for(Employee employee: employees)
			if(employee.getEmployeeId()==employeeId)
				return employee;
		return null;
			
	}

	@Override
	public boolean deleteEmloyee(int EmployeeId) {
		for(Employee employee: employees)
			if(employee.getEmployeeId()==EmployeeId)
			{
				employees.remove(employee);
		        return true;
	}
			else return false;
		return false;
	}
	
	
	@Override
	public boolean addEmployee(Employee employee) {

		return employees.add(employee);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employee;

//		for(Employee employee:employees)
//		{
//			if()}
//		}
	
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employees;
	}

	
	
	
	
	
	

}

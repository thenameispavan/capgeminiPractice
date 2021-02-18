package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.config.EmployeeData;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> displayAllEmployee() {
		// TODO Auto-generated method stub
		return EmployeeData.getEmplist();
	}

	@Override
	public String createEmployee(Employee emp) {
		EmployeeData.getEmplist().add(emp);
		return "employee added";
	}

	@Override

	public Employee findEmployee(int empid) {
		List<Employee> emp= EmployeeData.getEmplist();
		for(Employee e:emp) {
			if(empid==e.getEmpid()) {
				return e;
			}
		}
		return null;
	}

	@Override
	public Employee deleteEmployee(int empid) {
		List<Employee> emp= EmployeeData.getEmplist();
		for(Employee e:emp) {
			if(empid==e.getEmpid())
				emp.remove(e);
			return e;
		}
		return null;
	
	}

	@Override
	public Employee updateSalary(int empid, double salary) {
		List<Employee> empsal= EmployeeData.getEmplist();
		for(Employee e:empsal) {
			if(empid==e.getEmpid()) {
				e.setSalary(salary);
				return e;
			}
			
		}
		return null;
	}
	
}

package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImpl;

public class EmployeeServiceImp implements EmployeeService{
	EmployeeDao eDao= new EmployeeDaoImpl();
	@Override
	public List<Employee> printAllEmployee() {
		// TODO Auto-generated method stub
		return eDao.displayAllEmployee();
	}

	@Override
	public String register(Employee e) {
		boolean b= false;
		if(e.getName().isEmpty()||e.getSalary()<0||e.getDomain().isEmpty())
		return "Invalid Data";
		else {
			for(Employee emp:eDao.displayAllEmployee()) {
			if(emp.getEmpid()==e.getEmpid()) {
				b=true;
				break;
			}
		}
	}
		if(b) {
			return "emp id already available";
		}
		else {
			return eDao.createEmployee(e);
		}
	}

	@Override
	public Employee getEmployee(int empid) {
		return eDao.findEmployee(empid);
	}

	@Override
	public Employee deleteEmp(int empid) {
		return eDao.deleteEmployee(empid);
		
	}

	@Override
	public Employee updateSal(int empid, double salary) {
		return eDao.updateSalary(empid, salary);
	}

}

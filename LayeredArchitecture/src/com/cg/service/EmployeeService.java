package com.cg.service;
import java.util.*;

import com.cg.bean.Employee;
public interface EmployeeService {
	List<Employee> printAllEmployee();
	String register(Employee e);
	Employee getEmployee(int empid);
	Employee deleteEmp(int empid);
	Employee updateSal(int empid, double salary);
}

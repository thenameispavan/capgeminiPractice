package com.cg.dao;
import java.util.*;

import com.cg.bean.Employee;
public interface EmployeeDao {
	List<Employee> displayAllEmployee();
	String createEmployee(Employee emp);
	Employee findEmployee(int emp);
	Employee deleteEmployee(int empid);
	Employee updateSalary(int empid,double salary);

}

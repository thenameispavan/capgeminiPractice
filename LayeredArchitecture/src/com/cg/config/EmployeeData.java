package com.cg.config;

import java.util.*;

import com.cg.bean.Employee;

public class EmployeeData {
	private static List<Employee> emplist;
	static {
		emplist=new ArrayList<Employee>();
		emplist.add(new Employee(101,"ravi",23000,"java"));
		emplist.add(new Employee(102,"raju",32000,"dbms"));
		emplist.add(new Employee(103,"rama",45000,"oops"));
		emplist.add(new Employee(104,"rao",60000,"sql"));
	}
	public static List<Employee> getEmplist(){
		return emplist;
}

}

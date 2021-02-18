package day7;

import java.util.Comparator;

class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}

class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary.compareTo(o2.salary);
	}
}

public class Employee {
	String name;
	Integer salary;

	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + "\t" + salary;
	}
	/*
	 * @Override public int compareTo(Employee o1) { Scanner s= new
	 * Scanner(System.in); String str= s.next(); if(str.equals(str))) return
	 * o1.salary.compareTo(this.salary); }
	 */
}

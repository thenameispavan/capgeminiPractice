package com.cg.pl;

import java.util.Scanner;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImp;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService eService= new EmployeeServiceImp();
		Scanner sc= new Scanner(System.in);
		String ch="yes";
		while(ch.equalsIgnoreCase("yes")) {
			System.out.println("press 1 for display all employee: ");
			System.out.println("press 2 for new employee: ");
			System.out.println("press 3 for searching employee: ");
			System.out.println("press 4 for deleting employee: ");
			System.out.println("press 5 for updating salary: ");
			System.out.println("enter choice: ");
			int c= sc.nextInt();
			switch(c) {
			case 1:
				for(Employee e:eService.printAllEmployee())
					System.out.println(e);
				break;
			case 2:
				int eid=sc.nextInt();
				String name=sc.next();
				double sal= sc.nextDouble();
				String domain= sc.next();
				String result=eService.register(new Employee(eid,name,sal,domain));
				System.out.println(result);
				break;
			case 3:
				System.out.println("enter employee id: ");
				int id= sc.nextInt();
				if (eService.getEmployee(id)==null) {
					System.out.println("doesn't exist");
					
				}
				else {
					System.out.println(eService.getEmployee(id));
				}
				break;
			case 4:
				System.out.println("enter emp id: ");
				int id1= sc.nextInt();
				if (eService.deleteEmp(id1)==null) {
					System.out.println("doesn't exist");
					
				}
				else {
					System.out.println("successfully deleted");
				}
				break;
			case 5:
				System.out.println("enter emp id: ");
				int id2= sc.nextInt();
				double salary= sc.nextDouble();
				if (eService.updateSal(id2,salary)==null) {
					System.out.println("doesn't exist");
					
				}
				else {
					System.out.println("successfully updated");
				}
				break;
				
				default:
					System.out.println("wrong option chosen");
					break;
			}
			System.out.println("do you want to continue again");
			ch=sc.next();
		}
		System.out.println("Exited!!!");
	}

}

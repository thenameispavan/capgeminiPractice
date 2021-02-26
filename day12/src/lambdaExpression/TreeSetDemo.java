package lambdaExpression;

import java.util.*;
//class sortbySalary  implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee e1, Employee e2) {
//		// TODO Auto-generated method stub
//		return e2.getSalary().compareTo(e1.getSalary());
//	}
//	
//}

public class TreeSetDemo {

	public static void main(String[] args) {
		Comparator<Employee> sortbyName=(e1,e2)->e1.getName().compareTo(e2.getName());
		Comparator<Employee> sortbySalary=(e1,e2)->e1.getSalary().compareTo(e2.getSalary());
		Comparator<Employee> sortbyAge=(e1,e2)->e1.getAge().compareTo(e2.getAge());
		Set<Employee> s=null;
		Scanner sc=new Scanner(System.in);
		int choice= sc.nextInt();
		switch(choice) {
		case 1:
			s=new TreeSet<Employee>(sortbyName);
			break;
		case 2:
			s=new TreeSet<Employee>(sortbySalary);
			break;
		case 3:
			s=new TreeSet<Employee>(sortbyAge);
			break;
		default:
			System.out.println("please enter the correct choice: ");	
		}
		
		Set<Employee> s1=new TreeSet<Employee>(sortbyAge);
		s.add(new Employee("ram",35000.00,24));
		s.add(new Employee("raj",45000.00,22));
		s.add(new Employee("rahim",55000.00,30));
//		s1.add(new Employee("ram",35000.00,24));
//		s1.add(new Employee("raj",45000.00,12));
//		s1.add(new Employee("rahim",55000.00,30));
		for(Employee e:s) {
			System.out.println(e);
		}
//		for(Employee e:s1) {
//			System.out.println(e);
//		}
	}

}

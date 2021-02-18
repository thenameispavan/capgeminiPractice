package day7;
import java.util.*;
public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ch= sc.next();
		Set<Employee> s=null;
		if(ch.equalsIgnoreCase("name"))
			s= new TreeSet<Employee>(new SortByName());
		else if(ch.equalsIgnoreCase("salary"))
			s= new TreeSet<Employee>(new SortBySalary());
		s.add(new Employee("a",320));
		s.add(new Employee("d",330));
		s.add(new Employee("c",340));
		s.add(new Employee("b",350));
		
		System.out.println(s);
	}

}

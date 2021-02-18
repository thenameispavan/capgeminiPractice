package day7;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m= new Hashtable<String, String>();
		m.put("amit", "abc@123");
		m.put("shiva", "bca@123");
		m.put("avi", "cab@123");
		//System.out.println(m.get("amit"));
		/*
		 * Set<String> uname=m.keySet(); Collection<String> value=m.values();
		 * System.out.println(uname); System.out.println(value);
		 */
		Scanner s= new Scanner(System.in);
		String uname= s.next();
		String pass=s.next();
		if(m.containsKey(uname)) {
			if(m.get(uname).equals(pass)) {
				System.out.println("welcome");
			}
			else
			{
				System.out.println("invalid password");
			}
		}
		else
			System.out.println("invalid username");
		
	}

}

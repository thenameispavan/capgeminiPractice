package StringManipulation;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(stringContains(str));

	}

	private static boolean stringContains(String str) {
		if(str.contains("*")) {
			char[] c=str.toCharArray();
			if(c[(str.indexOf("*")-1)]==c[(str.indexOf("*")+1)]) {
				return true;
			}
			else 
				return false;
			
		}
		return false;
		
	}

}

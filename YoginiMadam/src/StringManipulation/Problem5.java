package StringManipulation;

import java.util.Scanner;


public class Problem5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		System.out.println(middleThree(str));

	}

	private static String middleThree(String str) {
		String str1 =(str.substring((str.length()/2)-1,(str.length()/2)+2));
		return str1;
		
	}

}

package StringManipulation;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str1= sc.next();
		String str2= sc.next();
		int n= sc.nextInt();
		System.out.println(separatorPattern(str1,str2,n));
		
	}

	private static String separatorPattern(String str1, String str2, int n) {
		String str3=str1+str2;
		String str4= "";
		for(int i=0;i<n;i++) {
			str4+=str3;
		}
		return str4.substring(0,str4.length()-str2.length());
		// TODO Auto-generated method stub
		
	}

}

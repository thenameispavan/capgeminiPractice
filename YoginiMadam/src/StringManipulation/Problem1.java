package StringManipulation;

import java.util.Scanner;

public class Problem1 {
	public static String findStr(String str) {
		String str1= str.substring(1, str.length()-1);
		return str1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(findStr(str));

	}

}

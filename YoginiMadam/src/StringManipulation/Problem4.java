package StringManipulation;

import java.util.Scanner;

public class Problem4 {
	public static String removeDup(String str) {
		char[] c=str.toCharArray();
		String str1="";
		for(char i:c) {
			if(str1.indexOf(i)==-1) {
				str1+=i;
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(removeDup(str));
		
	}

}

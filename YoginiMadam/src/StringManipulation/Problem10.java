package StringManipulation;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(printSum(str));

	}

	private static int printSum(String str) {
		char[] c=str.toCharArray();
				char a;
		int count=0;
				for(char i:c) {
					if(Character.isDigit(i)) {
						String b=""+i;
						int x=Integer.parseInt(b);
						count+=x;
					}
						
				}
				return count;
	}

}

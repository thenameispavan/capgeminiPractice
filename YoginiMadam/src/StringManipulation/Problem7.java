package StringManipulation;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(sandWich(str));

	}

	private static String sandWich(String str) {
		int index1= str.indexOf("bread");
		int index2=str.indexOf("bread",index1+1);
		String result= str.substring(index1+5,index2);
		return result;
		
	}

}

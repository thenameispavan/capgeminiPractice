package StringManipulation;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		boolean isSummer= sc.nextBoolean();
		System.out.println(squirrelPlay(temp,isSummer));

	}

	private static boolean squirrelPlay(int temp, boolean isSummer) {
		if(isSummer==true) {
			if(temp>=60&&temp<=100) {
				return true;
			}
			else
				return false;
		}
		else{
			if(temp>=60&&temp<=90) {
				return true;
			}
			else
				return false;
		}
		
	}

}

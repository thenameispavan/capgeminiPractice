package StringManipulation;

import java.util.Scanner;

public class Problem3 {
	public static boolean lastStr(String str) {
		if((str.substring((str.length())-2, (str.length()))).equals("ly"))
		return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(lastStr(str));

	}

}
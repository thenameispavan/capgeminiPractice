package StringManipulation;

import java.util.Scanner;

public class Problem2 {
	public static String middleStr(String str) {
		String str1= str.substring((str.length()/2)-1, (str.length()/2)+1);
		return str1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(middleStr(str));

	}

}

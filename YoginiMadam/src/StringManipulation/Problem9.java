package StringManipulation;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		System.out.println(returnTriples(str));

	}

	private static int returnTriples(String str) {
		char[] c= str.toCharArray();
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			if(c[i]==c[i+1]&&c[i]==c[i+2]) {
				count++;
			}
		
	}
		return count;
	}
}

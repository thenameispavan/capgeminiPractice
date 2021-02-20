package StringManipulation;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int speed=sc.nextInt();
		boolean isBirthday=sc.nextBoolean();
		System.out.println(caughtSpeeding(speed,isBirthday));

	}

	private static int caughtSpeeding(int speed, boolean isBirthday) {
		if(isBirthday==true) {
			if(speed<=65) {
				return 0;
			}
			else if(speed>=66&&speed<=85) {
				return 1;
			}
			else if(speed>85) {
				return 2;
			}
		}
		else {
			if(speed<=60) {
				return 0;
			}
			else if(speed>=61&&speed<=80) {
				return 1;
			}
			else if(speed>80) {
				return 2;
			}
		}
		return speed;
		
	}

}

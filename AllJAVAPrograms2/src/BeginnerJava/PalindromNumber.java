package BeginnerJava;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int num,sum = 0, temp,r;
		System.out.println("Enter any Positive number : ");
		num = input.nextInt();
		
		temp = num;
		 while( temp != 0) {
			 r = temp % 10;
			 sum = sum*10 + r;
			 temp = temp / 10;
		 }
		if( sum == num) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not a Palindrom Number");
		}
		
		
	}

}

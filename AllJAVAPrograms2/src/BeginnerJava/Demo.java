package BeginnerJava;

import java.util.Scanner;

public class Demo {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int num, i, first=0, second=1, fibo=0;
	        System.out.print("?th Fibonacci number do you want: ");
	        num = in.nextInt();
	        
	        for(i=3; i<=num; i++){ 
	        fibo= first+ second;
	        first = second;
	        second = fibo;
	         }
	        System.out.println("Your "+num+"th Fibonaki  number is: "+fibo);


	    }
}

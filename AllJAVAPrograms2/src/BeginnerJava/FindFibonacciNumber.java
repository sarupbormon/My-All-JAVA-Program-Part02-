package BeginnerJava;

import java.util.Scanner;

public class FindFibonacciNumber {
	
	    
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n,first=0,second=1,fibo;
	        System.out.print("which fibonacci number you want to see?");
	        n = input.nextInt();
	      
	        for (int i = 3; i <=n; i++) {
	            fibo = first+second;
	             
	           
	            first=second;
	            second=fibo;
	            if(n==i){
	                System.out.println(""+fibo);
	            }
	        }
	    }
	    
	}
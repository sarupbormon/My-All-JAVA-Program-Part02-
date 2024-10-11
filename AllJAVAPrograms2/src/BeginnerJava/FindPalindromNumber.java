package BeginnerJava;

import java.util.Scanner;

public class FindPalindromNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  
	    int m, n , i , r, tamp, sum=0, count=0; 
	    
	        System.out.print("Enter initial value: ");        
	        m=input.nextInt();
	        System.out.print("Enter final value: ");        
	        n=input.nextInt();
	  
	        System.out.println("Palindrom number are : "); 
	   
	    
	        for ( i = m; i <= n; i++) {
	    
	            tamp= i;
	            while(tamp!=0){
	            r=tamp%10;
	             sum=sum*10+ r;
	             tamp=tamp/10;
	             
	           }
	           if(sum==i){
	               System.out.print(i+" ");               
	               count++;
	           }
	         
	        sum = 0;
	        }
	        System.out.println();        
	        System.out.println("Total palindrome number from "+m+" to "+n + " is: "+count);        
	    
	    }
	}

	


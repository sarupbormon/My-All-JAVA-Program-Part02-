package BeginnerJava;
import java.util.Scanner;

public class Loop2Demo {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
		 int i , sum =0;
		 int m,n;
		 
		 System.out.println("Enter Initial number : ");
		 m = input.nextInt();
		 
		 System.out.println("Enter Final number : ");
		 n = input.nextInt();
		 
		 for( i =m; i <= n; i++)
			 sum = sum +i;
		 
		 System.out.println("The sum is : "+sum);
	}    
    
}     

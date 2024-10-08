package BeginnerJava;
import java.util.Scanner;

public class Series1Demo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int  i,n,sum =0;
		
		System.out.println("Enter the Last Number = ");
		n= input.nextInt();
		
		for( i = 1; i <= n ; i++) {
			
			System.out.print(i+" ");
			sum = sum + i;
		}
		System.out.println();
		System.out.println("The Sum of : "+sum);
	}

}

package BeginnerJava;
import java.util.Scanner;
public class PrimeNumberDemo {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enetr Any Positive Number : ");
		 int num = input.nextInt();
		 
		 int count = 0;
		
		 for(int i=2; i < num ; i++) {
			
			 if(num%i == 0) {
				count++;
				 break;
			 }
		 }
		 if(count == 0) {
			 System.out.println("It is Prime Number");
			 
		 }else {
			 
			 System.out.println("It's not a Prime Number");
		 }
		 
		 
	}

}

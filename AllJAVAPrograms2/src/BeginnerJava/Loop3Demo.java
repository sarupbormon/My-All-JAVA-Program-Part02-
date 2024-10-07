package BeginnerJava;
import java .util.Scanner;
public class Loop3Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int i , sum =0;
		 int m,n;
		 
		 System.out.println("Enter Initial number : ");
		 m = input.nextInt();
		 
		 System.out.println("Enter Final number : ");
		 n = input.nextInt();
		 
		 for( i =m; i <= n; i++) {
			 if(i%2==0) {
			 
			 System.out.print(" "+i);
			 }
			 sum = sum +i;
		 
		 }	 
		 System.out.println();
		 System.out.println("The Sum is :"+sum);
	}

}

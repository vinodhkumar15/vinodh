package task;

import java.util.Scanner;

public class Factorical {

	public static void main(String[] args) {
		int n;
		 int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number:");
		 n =  sc.nextInt();
		 for(int i=1;i<=n;i++) {
			 fact = fact*i;
		 }
		 System.out.println("factorial of"+n+"is"+fact);
		 
	}

}

package task;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number:");
		int number = sc.nextInt();
		
		if(number>0) {
			
			System.out.println(" The number is positive");
			
		}
		else if(number<0) {
			System.out.println("The number is negetive");
			
		}
		else {
			System.out.println("The number is zero");
			
		}
		sc.close();
	
	}

}

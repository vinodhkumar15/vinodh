package task;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Quantity:");
		int Quantity = sc.nextInt();
		
		if(Quantity>=10) {
			
			System.out.print("discount apply on 10%");
		}
		else 
		{
			System.out.print(" NO discount");
		}
		sc.close();
	}

}

package task;

import java.util.Scanner;

public class PrimeNum {
   
	public static void main(String[] args) {
		int count =0;
		
		 
	Scanner sc = new Scanner(System.in);
	System.out.print(" Enter the Number:");
	 int num=  sc.nextInt();
	
	for(int i=1;i<=num;i++) {
		if(num%i==0)
		{
			count++;
		}
	}
		if(count==2) {
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println(num+" is not prime  number");	
		}
		
	
	sc.close();

	}

}

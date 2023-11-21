package task;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNum= 0;
		int secondNum=1;
	
		int Result;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number:");
		 int mynum=  sc.nextInt();
		  while(true) {
			  Result = firstNum+secondNum;
			  count++;
			  if(Result>=mynum) {
				  break;
			  }
			  firstNum=secondNum;
			  secondNum=Result;
			  System.out.print("\nFibonacciNO.["+count+"] "+Result );
			  
		  }
		
		  sc.close();


	}

}

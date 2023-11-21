package task;

import java.util.Scanner;

public class Mango {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: "); 
		
		//reads an integer from the user  
		int n = sc.nextInt();  
		System.out.println("The orange, mango, and orangemango numbers are: ");  
		
		
		for (int i = 1; i <= 50; i++)   
		{  
		
		if (i%3==0 && i%5==0)   
		{   
	
		System.out.print("orangemango");  
		}   
		
		else if (i%3==0)   
		{  
		 
		System.out.print("mango");  
		}   
		
		else if (i%5==0)   
		{   
		
		System.out.print("orange");  
		}   
		else   
		{  
		//prints the number itself if the number is not divisible by both 3 and 5     
		System.out.print(i);  
		}  
		//prints space  
		System.out.print(","+" ");  
		}  
		//close the Scanner  
		sc.close();

	}

}

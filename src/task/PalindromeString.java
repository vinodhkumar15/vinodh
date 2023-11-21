package task;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string:");
		String mystring = sc.nextLine();
		  
		String rev="";
		 for(int i = mystring .length()-1;i>=0;i--);
				 
		 {
			 rev= rev + mystring .charAt(i);
			 
		 }
		 if(mystring.equals(rev)) {
			 System.out.println(mystring+ " is palindrome");
		 }
		 else 
		 {
			 System.out.println(mystring+ " is not palindrome"); 
		 }
		
		
		

	}

}

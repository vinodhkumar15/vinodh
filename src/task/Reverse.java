package task;

import java.util.Scanner;

public class Reverse {
	
		
	public static void main(String[] args) {
	
		String name= "marolix";
		char [] reverse= new char[name.length()];
		int length = name .length()-1;
		 
		 for(int i=0;i<=length;i++)
		 {
			 reverse[i]  = name.charAt(length-i);
			 
		 }
		 System.out.println(String.copyValueOf(reverse).toLowerCase());
		
		
		
		
		
		
	}
}
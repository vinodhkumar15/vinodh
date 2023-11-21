package task;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Age:");
		int age = sc.nextInt();
 if(age>=0 &&age<=12){
	 
	 System.out.print("they are chlid");
	 
 }
 else if(age>=13 &&age<=19) {
	 System.out.print("they are teenager");
	 
 }
 else if(age>=20 && age<=64) {
	 System.out.print("they are an adult");
 }
 else if (age>=65){
	 System.out.print("they are senior");
 }
 sc.close();

	}

}

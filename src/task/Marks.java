package task;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the marks:");
		 int marks = sc.nextInt();
		 
		 if(marks<=34) {
				System.out.print(" fail");
				 }
		 else if(marks>=35 && marks<45) {
			 System.out.print(" D");
			 
		 }
		 else if(marks<=45 && marks<=60) {
			 System.out.print(" c");
		 }
		 else if (marks>=60 && marks<70) {
			 System.out.print(" B");
		 }
		 else if (marks>=70 && marks<85) {
			 System.out.print(" A");
		 }
		 else if (marks>=95 && marks<95) {
			 System.out.print(" A++");
		 }
		 else if(marks>=95 && marks==100) {
			 System.out.print(" Grand outstanding");
		 }
		 else if(marks>=101) {
			 System.out.print(" invalid");
		 }
		 sc.close();
		 

	}

}

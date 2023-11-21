package task;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number:");
		 int num=  sc.nextInt();
		 
		 int my_num= num;
		 int rev=0;
		 
		 while(num!=0)
		 {
			 rev = rev*10+num%10;
			 num = num/10;
		 }
		 if(my_num==rev)
		 {
			 System.out.println(my_num+ "palindrome");
		 }
		 else {
			 System.out.println(my_num+" not palindrome");
		 }
		 
	}

}

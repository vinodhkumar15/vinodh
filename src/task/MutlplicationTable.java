package task;

public class MutlplicationTable {

	public static void main(String[] args) {
		  int start = 5;
	        int end = 10;
	        System.out.println("vinod");
	        for (int i = start; i <= end ; i++) {
	            System.out.println("Multiplication table for " + i + ":");
	            for (int j = 1; j <= 10; j++) {
	                System.out.println(i + " x " + j + " = " + (i * j));
	            }
	            System.out.println(); // Add an empty line for separation
	        }

	}







}
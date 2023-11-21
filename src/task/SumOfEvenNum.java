package task;

public class SumOfEvenNum {

	public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 30; i ++) {
            sum += i;
        }

        System.out.println("The sum of even numbers from 1 to 30 is: " + sum);

	}

}

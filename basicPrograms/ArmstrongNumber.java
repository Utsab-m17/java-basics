package basicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number -");
		int num = sc.nextInt();
		int arm = 0;
		int remainder;
		int temp = num;
		
		while(num>0) {
			remainder = num % 10;
			arm = arm + (remainder*remainder*remainder);
			num = num/10;
		}
		if(temp == arm) {
			System.out.println("it is a Armstrong number.");
		}else {
			System.out.println("this number is not Armstrong.");
		}
	}

}

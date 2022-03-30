package basicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the series -");
		int length = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("Fibonacci series -");
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<length-2; i++) {
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

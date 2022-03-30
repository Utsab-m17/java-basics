package basicPrograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Prime Number.");
		}else {
			System.out.println("Not Prime Number.");
		}

	}
}

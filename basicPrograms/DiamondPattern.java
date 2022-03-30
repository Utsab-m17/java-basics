package basicPrograms;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows -");
		int row = sc.nextInt();
		int space = row - 1;
		
		for(int i = 1; i <=row ; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			space--;
			for(int j = 1; j <= 2 * i - 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		space = 1;
		for(int i = 1; i <=row-1 ; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			space++;
			for(int j = 1; j <= 2 * (row - i) - 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

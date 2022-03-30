package basicPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string - ");
		String str1 = sc.nextLine();
		String str2 = "";
		int len = str1.length();
		
		for(int i = len-1 ; i >= 0 ; i--) {
			str2 += str1.charAt(i);
		}
		
		if(str2.equalsIgnoreCase(str1)) {
			System.out.println("This string is Palindrome.");
		}else {
			System.out.println("This string is not Palindrome");
		}
	}
}

//
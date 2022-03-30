package basicPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number -");
		int num = sc.nextInt();
		int temp = num;
        int sum=0;
        int remainder;
        
		while(num>0){    
		   remainder = num%10;   
		   sum = (sum*10) + remainder;    
		   num = num/10;    
		  }    
		
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}

}

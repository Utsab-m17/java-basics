package basicPrograms;

import java.util.Scanner;

public class RemoveCharactersFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string - ");
		String str = sc.nextLine();
		System.out.println("Enter position - ");
		int i = sc.nextInt();
		System.out.println(charRemoveAt(str, i));  
    }  
    public static String charRemoveAt(String str, int p) {  
       return str.substring(0, p) + str.substring(p + 1);  
    }  

}

package week2day2;

import java.util.Scanner;

public class DailyChallengeCodeDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
		System.out.print("Enter you String here :");
		Scanner scan =new Scanner(System.in);
		 String word=scan.nextLine();
		 int length =word.length();
		 
		 for(int i=length-1;i>=0;i--) {
			reverse =reverse + word.charAt(i); 
			 
		 }
		 if(word.equals(reverse)) {
			 System.out.println("Given String is a palindrome");
		 }else
			 System.out.println("given string is not a palindrome");
		
	}

}

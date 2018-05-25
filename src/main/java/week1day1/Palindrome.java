package week1day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		System.out.print("Enter the number :");
		Scanner s =new Scanner(System.in);
		
		int palindrome =s.nextInt();
		int inputNumber = palindrome ;
		int copyOfinput = inputNumber ;
		int sumOfdigits = 0 ;
		int quotient,reminder ;


		while(inputNumber >0) 
		{

			quotient = inputNumber/ 10 ;
			reminder =inputNumber %10 ;
			sumOfdigits = sumOfdigits *10 + reminder ;
			inputNumber = quotient ;


		}
		if(copyOfinput ==sumOfdigits)

			System.out.println("The given number is a palindrome");
		else
			System.out.println("The given number is not a palindrome");
	}



}




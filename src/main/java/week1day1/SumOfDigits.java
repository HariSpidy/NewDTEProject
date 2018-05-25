package week1day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		System.out.print("Enter the number :");
		Scanner sum = new Scanner(System.in);
		int number	= sum.nextInt();
		int inputNumber = number ;
		int copyOfinput = inputNumber ;
		int sumOfdigits = 0 ;
		int quotient,reminder ;


		while(inputNumber > 0) 
		{

			quotient = inputNumber/ 10 ;
			reminder =inputNumber %10 ;
			sumOfdigits = sumOfdigits + reminder ;//sumOf digits+=reminder;
			inputNumber = quotient ;


		}

		System.out.println("The sum of digits of "+copyOfinput +" is " +sumOfdigits);

	}

}

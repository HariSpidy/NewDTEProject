package week2day2;

import java.util.Scanner;

public class CodingChallengeDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two number and one string");
		System.out.print("Get the first number :");
		Scanner scan=new Scanner(System.in);
		int number0 = scan.nextInt();
		System.out.print("Get the second number :");
		int number2 = scan.nextInt();
		System.out.print("Enter any one of the string either addition/subtraction/multiply/divide :");
		Scanner scan2 =new Scanner(System.in);
		String string0 = scan2.nextLine();
		if(string0.equalsIgnoreCase("addition")) 
		{
			
			int number3 = number0+number2;
			System.out.print("you performed Addition operation and your answer is :"+number3);
		}
			else if(string0.equalsIgnoreCase("subtraction"))
			{
				int number5 = number0-number2;
				System.out.print("you performed Addition operation and your answer is :" +number5);
			}
			else if(string0.equalsIgnoreCase("multiplication"))
			{
				int number6 =number0 *number2;
				System.out.print("you performed Addition operation and your answer is :"+number6);
			}
			else if(string0.equalsIgnoreCase("dvision"))
			{
				int number7 =number0 /number2;
				System.out.print("you performed Addition operation and your answer is :"+number7);
			}
		
		

	}

}

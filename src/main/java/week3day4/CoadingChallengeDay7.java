package week3day4;

import java.util.Scanner;

public class CoadingChallengeDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year");
		Scanner scan = new Scanner(System.in);
		int year =scan.nextInt();
		
		
		
		
		if(year % 400 == 0) 
		{
			
			
			System.out.println("leap year");
		}else if(year% 100 == 0) 
		{
			System.out.println("not a leap year");
		}

	}

}

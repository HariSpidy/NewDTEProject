package testLeafJAVAProgramsForInterviews;

import java.util.Random;
import java.util.Scanner;
//Write a program to Generate random numbers in a given range
public class RandomNumberGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to generate the Random number :");
		
		Scanner sc = new Scanner(System.in);
		int Intvalue = sc.nextInt();
		
		System.out.println("Specify the Range of Random Number :");
		int range = sc.nextInt();
		for (int i = 0; i < Intvalue; i++) {
			Random r = new Random();
			int nextInt = r.nextInt(range);
			System.out.println(nextInt);
			
		}
		
		
		
	}

}

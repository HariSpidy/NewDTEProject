package week1day1;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Enter the number starting with 100 :");
//Scanner s =new Scanner(System.in);
		
		//int number =s.nextInt();
	//	int inputNumber = number ;
		//int inputNumber =100;
		int sum = 0 ;
		int quotient,reminder ;
		int i;
		for( i=100;i<=1000;i++) {
			int n=i;
		while( n >0) 
		
		{
			
			reminder =n %10 ;
			sum =  sum + reminder * reminder * reminder ;
			n = n/ 10 ;
		}


		
		if(sum == i)
		{
			System.out.println("The given number is a Amstrong"+i);
		}
		
		sum=0;
		}
		
		
	}

}

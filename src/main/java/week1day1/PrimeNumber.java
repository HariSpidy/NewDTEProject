package week1day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub


		System.out.print("Enter the Number  :");
		Scanner number =new Scanner(System.in);
		int newnumber = number.nextInt();
		

		boolean isPrime = true;

		for(int i=2;i<newnumber;i++) 
		{
			if(newnumber%i==0)
			{
				isPrime = false ;
				break;

			} 
		}
		if(isPrime)
			{
				System.out.println("Given number is a prime Number");
			}
			else
			{
				System.out.println("Given number is not a prime number");
			}

		}
	}



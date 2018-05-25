package week1homeworks;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbe0 =0;
		int number2 = 1;
	//	Scanner scan=new Scanner(System.in);
	//	int number3=scan.nextInt();
		
		System.out.print("0  ");
	     int number5= 0;
		for(int i=0;i<100;i++)
		{
			
		  number5 = numbe0 + number2 ;
		  System.out.println(number5+ " ");
		  if(number5 <100)
			  break ;
		  numbe0 = number2 ;
		  number2 = number5 ;
		  

		}

	}

}

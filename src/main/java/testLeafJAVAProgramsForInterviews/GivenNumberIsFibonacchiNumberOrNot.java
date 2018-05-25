package testLeafJAVAProgramsForInterviews;

import java.util.Scanner;

public class GivenNumberIsFibonacchiNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number :");	
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	
	int first =0;
	int second =1;
	int third =0;
	
	while (third < input) {
		
	
	third = first + second ;
	first =second;
	second = third;
	}
	if(third==input)	{
		
		System.out.println("The given number is a fibonacci  number");
	}else
		System.out.println("the number is not a fibonacci number");

	}

}

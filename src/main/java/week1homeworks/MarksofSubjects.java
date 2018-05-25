package week1homeworks;

import java.util.Scanner;

public class MarksofSubjects 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the marks which you got to know your Result  :");	
		int num0 [] =new int[10];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<=9;i++)
		{
			
		 num0[i] = scan.nextInt();
		 scan.close();
		
		}

		for(int display : num0)
		
		{
			

			if(display==35)
			{
				System.out.println(display+" - You are just pass");
			}
			else if(display < 35)
			{
				System.out.println(display+ " - You are fail,Better Luck Next time");
			}
			else if(display > 35 && display < 50)
			{
				System.out.println(display+" - you are pass with 2nd class");
			}
			else if(display > 50 && display < 80 )
			{
				System.out.println(display+" - You are pass with 1st class");
			}
			else if(display > 80 && display < 100 )
			{
				System.out.println(display+" - You are pass with distinction class");
			}


		}


	}

}




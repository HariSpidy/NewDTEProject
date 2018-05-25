package week1homeworks;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter you number :");
		Scanner scan2 =new Scanner(System.in);
		int newnumber = scan2.nextInt();
		scan2.close();
		for(int i=1;i<=10;i++)
		{
			
			int number2 = i* newnumber ;
			System.out.println(+i+"* " +newnumber + "= "+number2);
			
		}
	}

}

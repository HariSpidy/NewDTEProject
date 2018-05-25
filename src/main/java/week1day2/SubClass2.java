package week1day2;

import java.util.Scanner;

public class SubClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter you details ");
		System.out.print("Enter your name :");
		Scanner scan =new Scanner(System.in);
		String newname1=scan.next();
		scan.close();
		System.out.print("Enter you number :");
		Scanner scan2 =new Scanner(System.in);
		int newnumber = scan2.nextInt();
		scan2.close();
		System.out.print("Enter your Initial :");
		Scanner scan3=new Scanner(System.in);
		String newchar =scan3.next();
		scan3.close();
		
		LearningNewClass2 newobject = new LearningNewClass2();
		newobject.AssingTheValue(newname1, newnumber, newchar);
		newobject.displayValue();
				
	}

}

package week1homeworks;

import java.util.Scanner;

public class HomeworkWeek1DisplayNameofPeople {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the name of the person :");
		String subjects[]= {"hariprasath","suhail","diknesh","naveena","sanfar","bala","manoj","murugesh","bharath","vineeth"};
		//int age[] = {23,26,22,25,27,29};
		
		 for(String subname :subjects)
		 {
			 Scanner scan=new Scanner(System.in);
			 String num0=scan.nextLine();
			 scan.close();
			 if(subname.equalsIgnoreCase(num0))
				 System.out.println("Gender of the person is Male");
			 else if(num0.equalsIgnoreCase("naveena"))
				System.out.println("Gender of the person is female"); 
		 }
	}

}


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naveen2 {

	public static void main(String[] args) throws InterruptedException {
	   
		
		
		
		/*String str = new String("Site is BeginnersBook.com and book is begining with .com");

	       System.out.print("String after replacing com with net :" );
	       System.out.println(str.replaceFirst("com", "net"));
	       StringBuffer d =new StringBuffer("hari");
	       System.out.println(d.capacity());*/
	      /* String s = "hello";//{h,e,l,l,o}
	       char[] ch =new char[9];
	       int str1=s.length();
	       for(int i=str1-1;i>=0;i--) {
	    	   ch[i]=s.charAt(i);
	       
	    	   
	    	   System.out.print(ch[i]);
	       }*/
	    	 /*  StringBuffer sb=new StringBuffer();  
	    	   System.out.println(sb.capacity());//default 16  
	    	   sb.append("Hello");  
	    	   System.out.println(sb.capacity());//now 16 
	    	   StringBuffer d =new StringBuffer("hari");
		       System.out.println(d.capacity());*/
		 
		 /* String str2="b4";
		 String concat = str.concat(str2);
		 System.out.println(concat);
		 String substring = concat.substring(2);
		 System.out.println(substring);
		 
		 String st ="x5";
		 String replace = st.replace("x5", "x6");
		 System.out.println(replace);*/
		
		//TO COUNT THE OCCURANCE OF EACH CHARACTER IN A GIVEN TEXT 
		 
		/* String s ="testleaf";
		 int count=0;
		 char[] charArray = s.toCharArray();//charArray= {'t','e'}
		for(char each :charArray) {
			
			if(each=='t') {
				count++;
			}
		}
		System.out.println(count);	
		*/
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("Hari");
		list.add("senthil Kumar");
		list.add("Sindhu");
		list.add("priya");
		for (String names : list) {
			System.out.println(names);
			
		}
		*/
		
	
		System.out.println(Pattern.matches("[amn]", "a"));//false (not a or m or n)
		System.out.println(Pattern.matches("[^abc]", "d"));//true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "n"));//false (m and a comes more than once)
		

	       
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


